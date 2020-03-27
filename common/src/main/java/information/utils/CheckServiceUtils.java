package information.utils;

import java.net.InetAddress;

/**
 * @Classname CheckServiceUtils
 * @Date 2019/10/29 11:17
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description 查看服务是否可用
 */
public class CheckServiceUtils {

    /**
     * 查看服务器是否能链接
     * @param ip
     * @return
     * @throws Exception
     */
    public static boolean checkIp(String ip) throws Exception{
        int timeOut = 3000;
        boolean status = InetAddress.getByName(ip).isReachable(timeOut);;
        return status;
    }
}
