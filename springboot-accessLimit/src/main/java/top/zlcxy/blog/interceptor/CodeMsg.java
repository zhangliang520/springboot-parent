package top.zlcxy.blog.interceptor;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 23:29
 */
public enum CodeMsg {
    ACCESS_LIMIT_REACHED(-2,"已达到访问限制"),ACCESS_LIMIT_UNLOGIN(-3,"未登录访问限制");

    private int code;
    private String msg;


    private CodeMsg(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
