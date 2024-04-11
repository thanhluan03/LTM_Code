import java.net.NetworkInterface;
import java.util.Enumeration;

public class InterfaceLister {
    public static void main(String[] args) {
        try{
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()){
                //lay ra phan tu va ep kieu
                NetworkInterface ni = (NetworkInterface)interfaces.nextElement();
                System.out.println(ni);
            }
        }catch (Exception e)
        {
            System.out.println("Gap Loi!!");
        }
    }
}
