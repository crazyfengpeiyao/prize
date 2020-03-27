package information.exception;

/**
 * @Classname BasicException
 * @Date 2019/11/7 10:35
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 异常类基础类
 */
public class BasicException extends Exception {

    //错误码
    private int errorCode;



    public BasicException(int errorCode){
        super("ERROR");
        this.errorCode = errorCode;
    }


    public BasicException(int errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }


    public int getErrorCode() {
        return errorCode;
    }


}
