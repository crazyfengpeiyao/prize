package information.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname BaseBean
 * @Date 2020/2/20 11:20
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 公共属性
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseBean {
    private int createBy = -1;
    private Date createDate;
    private int updateBy = -1;
    private Date updateDate;
}
