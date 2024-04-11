import java.net.InetAddress;

public class ViDu {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("facebook.com");
            //tra ve doi tuong
            System.out.println(ia.getAddress());
            //tra ve IP
            System.out.println(ia.getHostAddress());
            //tra ve IP
            System.out.println(ia.getCanonicalHostName());
            //tra ve domain name
            System.out.println(ia.getHostName());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
