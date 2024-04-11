import java.net.URL;
import java.sql.SQLOutput;

public class ViDuURL {
    public static void main(String[] args) {
        try{
            URL u = new URL("https://sv.dntu.edu.vn/");
            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host: " + u.getHost());
            System.out.println("Port: " + u.getPort());
            System.out.println("File: " + u.getFile());
            System.out.println("Ref: " + u.getRef());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
