import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddresDemo01
{
    public static void main(String[] args)
    {
        InetSocketAddress address=new InetSocketAddress("127.0.0.1",9999);
        System.out.println(address.getHostName());
        System.out.println(address.getPort());
        InetAddress addr=address.getAddress();
        System.out.println(addr.getHostAddress()); //返回地址
        System.out.println(addr.getHostName()); //输出本机名
    }
}
