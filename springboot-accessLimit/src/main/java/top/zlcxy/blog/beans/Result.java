package top.zlcxy.blog.beans;

import top.zlcxy.blog.interceptor.CodeMsg;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 21:52
 */
public class Result {

    private int code;
    private String msg;
    private Object obj;

    private Result(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }


    public static Result success(String msg) {
        return new Result(0,msg,null);
    }

    public static Result error(CodeMsg codeMsg) {
        return new Result(codeMsg.getCode(),codeMsg.getMsg(),null);
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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
