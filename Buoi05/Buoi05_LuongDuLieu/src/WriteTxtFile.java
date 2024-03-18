import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTxtFile {
    public static void main(String[] args) {
        try {
            String dest = "C:\\Users\\ASUS\\Documents\\LTM_Code\\Buoi05\\Buoi05_LuongDuLieu\\src\\output.txt";
            //tao file
            File file = new File(dest);
            if (!file.exists())
                file.createNewFile();

            //PrintWriter
            PrintWriter pw = new PrintWriter(file, "UFT-8");

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap du lieu thanh tung dong de ghi ra file: ");
            System.out.println("Nhap exit de thoat!!!");
            while (true) {
                String line = sc.nextLine();
                if (line.equals("exit")) break;
                pw.println(line);
                pw.flush();
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
