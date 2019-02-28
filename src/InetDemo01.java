import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo01
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress addr=InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());//返回计算机名
        //根据ip得到InetAddress对象
        addr=InetAddress.getByName("www.163.com");
        System.out.println(addr.getHostAddress());//返回163服务器的ip地址
        System.out.println(addr.getHostName());//输出www.163.com
        //根据ip得到InetAddress对象
        addr=InetAddress.getByName("61.135.253.15");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
