import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {
    public static void main(String[] args) {
        String fileURL = "https://vnexpress.net/loat-co-vat-trieu-nguyen-sap-duoc-dau-gia-4728493.html";
        String saveDir = "C:\\download";

        try{
            URL url = new URL(fileURL);
            //tao ket noi de doc/ghi du lieu
            URLConnection connection = url.openConnection();
            //lay Inputstream tu ket noi
            InputStream is = connection.getInputStream();
            //lay ten file
            String fileName = fileURL.substring(fileURL.lastIndexOf("/") +1);
            //kiem tra thu muc
            File directory = new File(saveDir);
            if(!directory.exists()) {
                directory.mkdirs();
            }
            //tao ra fileOutputStream
            FileOutputStream fos = new FileOutputStream(saveDir+File.separator+fileName);
            int bytesRead;
            byte[] buffer = new byte[4096];
            while ((bytesRead=is.read(buffer)) !=-1){
                fos.write(buffer, 0,bytesRead);
            }

            System.out.println("File download successfully!");
            fos.close();
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
