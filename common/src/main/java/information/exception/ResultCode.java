package information.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname ResultCode
 * @Date 2019/11/7 10:41
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 错误码
 */
public class ResultCode {


    private static Map<Integer,String> resultMap = new HashMap<Integer, String>();
    public final static int SUCCESS=0;
    public final static int REQUEST_SUCCESS=400199;//成功
    public final static int LOGIN_SUCCESS=400200;//登录成功
    public final static int UPLOAD_SUCCESS=401200;//文件上传成功
    public final static int DVI_CAU_DATA_NOT_UPDATE=470109;//价格未更新
    public final static int DVI_CAU_DATA_ALREADY_EXISTS=470101;//该日期数据已经存在
    public final static int DVI_CAU_DATE_ILLEGAL_LINE=470102;//日期不合法
    public final static int DVI_CAU_DATE_DIFFERENT=470103;//存在不同的日期
    public final static int DVI_CAU_PRICE_BEYOND_COMMON_SENSE_LINE=470104;//价格超出常理
    public final static int DVI_CAU_PRICE_ILLEGAL_LINE=470105;//价格不合规范
    public final static int DVI_CAU_TOO_LITTLE_DATA_ERROR=470106;//数据太少
    public final static int DVI_CAU_DATA_LINE_OUT_OF_SPECIFICATION_LINE=470107;//数据行不合标准
    public final static int DVI_CAU_AREA_DIFFERENT=470108;//存在不同的市场名称
    public final static int DVI_SAMPLE_DATA_LINE_OUT_OF_SPECIFICATION_LINE=470111;//数据行不符合标准
    public final static int DVI_SAMPLE_DATA_ALREADY_EXISTS=470112;//该抽样日期已存在
    public final static int DVI_SAMPLE_DATA_AREA_DIFFERENT=470113;//抽样地点不一致
    public final static int DVI_SAMPLE_DATA_NOT_UPDATE=470114;//检测检疫数据未更新
    public final static int EXCEL_PARSING_ERROR=490101;//Excel文件解析失败
    public final static int EXCEL_CEL_NULL_ERROR=410102;//表格存在空项
    public final static int FILE_TYPE_ERROR=490102;//文件类型错误
    public final static int USER_NAME_OR_PASSWORD_ERROR=470110;//用户名或密码错误
    static {


        /*
         * 首位4的错误码是请求类错误：6位数字，第2位为错误类型，3～4位为模块，5～6位为错误序号 1. 第2位标示错误类型 40XXXX 不合法
         * 41XXXX 缺少 42XXXX 超时，过期 43XXXX 需要 44XXXX 为空 45XXXX 超过限制 46XXXX 不存在,49XXXX 文件错误
         * 47XXXX 内容错误 48XXXX 权限
         *
         * 2. 3～4位为模块
         *
         * 3. 5～6位为错误序号，从01开始计数
         */

        //数据库异常
        resultMap.put(ExceptionCode.DB_SELECT,"查询出错");
        resultMap.put(ExceptionCode.DB_INSERT,"保存出错");
        resultMap.put(ExceptionCode.DB_UPDATE,"修改出错");
        resultMap.put(ExceptionCode.DB_DELETE,"删除出错");

        resultMap.put(SUCCESS,"OK");
        // 4X01XX check-data
        resultMap.put(REQUEST_SUCCESS,"执行成功");
        resultMap.put(LOGIN_SUCCESS, "登录成功");//登录状态码
        resultMap.put(UPLOAD_SUCCESS,"文件上传成功");//文件上传成功
        resultMap.put(ExceptionCode.SYSTEM_ERROR,"内部错误");//系统内部错误
        resultMap.put(FILE_TYPE_ERROR,"文件类型错误");//文件校验
        resultMap.put(DVI_CAU_DATA_ALREADY_EXISTS,"当前已存在该日期的数据"); //中农联农产品数据校验
        resultMap.put(DVI_CAU_DATA_NOT_UPDATE,"%s 数据未更新"); //Cau数据未更新
        resultMap.put(DVI_CAU_DATE_ILLEGAL_LINE,"日期不合法,出现在行:%d");
        resultMap.put(DVI_CAU_DATE_DIFFERENT,"数据中存在不同的日期");
        resultMap.put(DVI_CAU_PRICE_BEYOND_COMMON_SENSE_LINE,"价格超出常理,出现在:%d");
        resultMap.put(DVI_CAU_PRICE_ILLEGAL_LINE,"价格不符合规范,出现在行:%d");
        resultMap.put(DVI_CAU_TOO_LITTLE_DATA_ERROR,"数据量过少");
        resultMap.put(DVI_CAU_DATA_LINE_OUT_OF_SPECIFICATION_LINE,"行不合标准,出现在行:%d");
        resultMap.put(DVI_SAMPLE_DATA_LINE_OUT_OF_SPECIFICATION_LINE,"行不合标准,出现在行:%d");
        resultMap.put(DVI_SAMPLE_DATA_ALREADY_EXISTS,"该抽样时间的数据已经存在");
        resultMap.put(DVI_SAMPLE_DATA_AREA_DIFFERENT,"抽样地点不一致");
        resultMap.put(DVI_CAU_AREA_DIFFERENT,"存在不同的市场名称");
        resultMap.put(EXCEL_PARSING_ERROR,"不能解析该excel文件"); //Excel文件解析
        resultMap.put(EXCEL_CEL_NULL_ERROR,"表格存在空项:%d");
        resultMap.put(USER_NAME_OR_PASSWORD_ERROR,"用户名或密码错误"); //用户&登录
        resultMap.put(ExceptionCode.UNEXPECT_ERROR,"意料之外的错误");//意料之外的错误
        resultMap.put(DVI_SAMPLE_DATA_NOT_UPDATE,"%s 检测检疫数据未更新");
    }

    /**
     * 根据状态码获取信息并设置所在行的位置
     * @param status
     * @param row
     * @return
     */
     public static String getMsg(int status,int row) {
        return String.format(resultMap.get(status),row);
    }

    public static String getMsg(int status,String s) {
        return String.format(resultMap.get(status),s);
    }
    /**
     * 根据状态获取信息
     *
     * @param status
     */
    public static String getMsg(int status) {
        return resultMap.get(status);
    }

}
