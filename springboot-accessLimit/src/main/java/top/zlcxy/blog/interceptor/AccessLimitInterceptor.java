package top.zlcxy.blog.interceptor;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.zlcxy.blog.beans.Result;
import top.zlcxy.blog.beans.User;
import top.zlcxy.blog.config.Contant;
import top.zlcxy.blog.service.RedisService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * @author zhangl
 * @version 1.0
 * @description: 拦截器限流
 * @date 2020-09-24 21:34
 */

@Component
public class AccessLimitInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisService<Integer> redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            //获取方法中的注解,看是否有该注解
            AccessLimit accessLimit = hm.getMethodAnnotation(AccessLimit.class);
            if (accessLimit == null) {
                return true;
            }
            int seconds = accessLimit.seconds();
            int maxCount = accessLimit.maxCount();
            boolean needLogin = accessLimit.needLogin();
            String key = request.getRequestURI();
            if (needLogin) {
                User currentuser = (User) request.getSession().getAttribute(Contant.CURRENT_USER);
                if (null == currentuser){
                    render(response, CodeMsg.ACCESS_LIMIT_UNLOGIN);
                    return false;
                }
                key += "_" + currentuser.getUserName();
            }
            AccessKey ak = AccessKey.withExpire(seconds);
            Integer count = redisService.get(ak, key);
            if (count == null) {
                //第一次访问
                redisService.set(ak, key, 1);
            } else if (count < maxCount) {
                //加1
                redisService.incr(ak, key);
            } else {
                //超出访问次数
                render(response, CodeMsg.ACCESS_LIMIT_REACHED); //这里的CodeMsg是一个返回参数
                return false;
            }
        }
        return true;
    }

    private void render(HttpServletResponse response, CodeMsg cm) throws Exception {
        response.setContentType("application/json;charset=UTF-8");
        OutputStream out = response.getOutputStream();
        String str = JSON.toJSONString(Result.error(cm));
        out.write(str.getBytes("UTF-8"));
        out.flush();
        out.close();
    }
}
