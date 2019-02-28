import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL url=new URL("http://www.baidu.com:80/idnex.html#aa?uname=hfut"); ///绝对路径构建
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());//资源
        System.out.println(url.getPath());//相对路径
        System.out.println(url.getRef()) ; //获取锚点
        System.out.println(url.getQuery());
        url=new URL("http://www.baidu.com:80/a");
        url=new URL(url,"/b.txt"); //相对路径构建
        System.out.println(url.toString());
    }
}
