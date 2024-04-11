import java.net.InetAddress;

public class LocalhostInFo {
    public static void main(String[] args) {
        try {
            //tao dia chi inet cho may thiet bi
            InetAddress ia = InetAddress.getLocalHost();
            //tra ve ten
            System.out.println( "My Name is: " + ia.getHostName());
            //tra ve ten
            System.out.println("My address is: " + ia.getHostAddress());


            //
            byte[] address = ia.getAddress();
            for (int i = 0; i < address.length; i++) {
                System.out.println(address[i]);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
