package top.zlcxy.blog.interceptor;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 23:28
 */
public class AccessKey {
    private int seconds;

    private AccessKey(int seconds){
        this.seconds = seconds;
    }

    public static AccessKey withExpire(int seconds) {
        return new AccessKey(seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
