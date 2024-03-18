import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String src, String dest){
        File fileSrc = new File(src);
        File fileDest = new File(dest);
        try {
        if(!fileSrc.exists()){
            System.out.println("File src khog ton tai!!!");
        }else {
            if (fileDest.exists()) {
                System.out.println("File dest da ton tai, ban co muon ghi de hay khog (y/n)?");
                Scanner sc = new Scanner(System.in);
                String c = sc.nextLine();
                if (c.equals("n")) {  //Neu khog muon ghi de thi ngung chuong trinh
                    return;
                }
            } else {
                fileDest.createNewFile();
            }

            //tao stream de doc du lieu
            FileInputStream fis = new FileInputStream(fileSrc);

            //tao stream ghi du lieu
            FileOutputStream fos = new FileOutputStream(fileDest);

            //copy tung byte
            int b = 0;
            while (true) {

                b = fis.read(); //doc len mot byte

                if (b == -1) break; //-1 khog co du lieu de doc

                fos.write(b); //ghi xuong
                fos.flush(); //ep du lieu duoc ghi xuong file ngay lap tuc
            }
            fis.close();
            fos.close();
        }

        } catch (IOException e){
                e.printStackTrace();
        }
    }

    public static void copyFileArr(String src, String dest){
        File fileSrc = new File(src);
        File fileDest = new File(dest);
        try {
            if(!fileSrc.exists()){
                System.out.println("File src khog ton tai!!!");
            }else {
                if (fileDest.exists()) {
                    System.out.println("File dest da ton tai, ban co muon ghi de hay khog (y/n)?");
                    Scanner sc = new Scanner(System.in);
                    String c = sc.nextLine();
                    if (c.equals("n")) {  //Neu khog muon ghi de thi ngung chuong trinh
                        return;
                    }
                } else {
                    fileDest.createNewFile();
                }

                //tao stream de doc du lieu
                FileInputStream fis = new FileInputStream(fileSrc);

                //tao stream ghi du lieu
                FileOutputStream fos = new FileOutputStream(fileDest);

                //copy tung byte
                byte[] arr = new byte[1024*1024];
                while (true) {

                    int n = fis.read(arr); //doc len mot byte

                    if (n == -1) break; //-1 khog co du lieu de doc

                    fos.write(arr, 0, n); //ghi xuong
                    fos.flush(); //ep du lieu duoc ghi xuong file ngay lap tuc
                }
                fis.close();
                fos.close();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String src = "C:\\Users\\ASUS\\Documents\\Thiet Ke WED\\HTML.pdf";
        String dest = "C:\\Temp\\HTML.pdf";

        // copyFile(src, dest);

        copyFileArr(src, dest);
    }
}
