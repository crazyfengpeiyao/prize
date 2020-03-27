package information.exception;


/**
 * @Classname ExceptionCode
 * @Date 2019/11/7 11:00
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 异常错误码常量
 */
public class ExceptionCode {

    /**
     * 系统操作异常码
     */
    public final static int SYSTEM_ERROR = 500101; // 服务器繁忙，请稍后再试


    /**
     * 数据库操作异常码
     */
    public final static int DB_SELECT = 500201; // 数据库查询错误

    public final static int DB_INSERT = 510201; // 数据库保存错误

    public final static int DB_UPDATE = 520201; // 数据库修改错误

    public final static int DB_DELETE = 530201; // 数据库删除错误

    public final static int UNEXPECT_ERROR=100500;
}
