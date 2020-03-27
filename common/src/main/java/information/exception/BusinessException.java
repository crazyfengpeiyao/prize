package information.exception;

/**
 * @Classname BusinessException
 * @Date 2019/11/7 10:39
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 业务异常
 */
public class BusinessException extends BasicException {

    public BusinessException(int errorCode) {
        super(errorCode,"BUSINESS ERROR");
    }

    public BusinessException(int errorCode, String msg) {
        super(errorCode, msg);
    }
}
