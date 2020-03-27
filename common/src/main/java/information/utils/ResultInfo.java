package information.utils;



import information.exception.ResultCode;

import java.io.Serializable;

/**
 * @Description: Description
 * @Author: jp
 * @CreateDate: 2019/4/29 11:00
 * @Version: 1.0
 */
public class ResultInfo<T> implements Serializable {

    public ResultInfo() {}

    public ResultInfo(int code) {
        this.code = code;
        this.msg = "成功";
    }

    public ResultInfo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultInfo(int code,T obj){
        this.code = code;
        if (code == 0){
            this.msg = "成功";
        }else {
            this.msg = ResultCode.getMsg(code);
        }
        this.obj = obj;
    }

    public ResultInfo(int code, String msg, T obj) {
        this.code = code;
        this.msg = ResultCode.getMsg(code);
        this.obj = obj;
    }



    /**
     * 消息码。
     * 默认：code = 0 成功
     */
    public int code = 0;

    /** 提示信息 */
    public String msg = "亲，系统繁忙！";

    /** 结果集中的对象 */
    public T obj;

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

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResultInfo [code=" + code + ", msg=" + msg + ", object="
                + obj + "]";
    }

}
