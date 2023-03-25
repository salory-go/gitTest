import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 项目名: gitTest
 * 文件名: GitTest
 * 创建者: LZS
 * 创建时间:2023/3/16 17:02
 * 描述:
 **/
public class GitTest {
    public static void main(String[] args) throws UnknownHostException {
//        System.out.println("hello github");
//        System.out.println("111111");
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
    }
}
