package information.exception;

/**
 * @Classname SystemException
 * @Date 2019/11/7 10:29
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 系统异常
 */
public class SystemException extends BasicException{

    public SystemException(int errorCode) {
        super(errorCode,"系统繁忙");
    }

    public SystemException(int errorCode, String msg) {
        super(errorCode, msg);
    }
}
