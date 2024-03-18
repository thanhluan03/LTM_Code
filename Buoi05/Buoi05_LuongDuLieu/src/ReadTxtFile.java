import java.io.*;

public class ReadTxtFile {
    public static void main(String[] args) {
        try{
            String src = "C:\\Users\\ASUS\\Documents\\LTM_Code\\Buoi05\\Buoi05_LuongDuLieu\\src\\vidu.txt";
            File file = new File(src); // B1
            //tao Inputstream
            InputStream is = new FileInputStream(file);
            //tao InputstreamReader
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            //tao BufferedReader
            BufferedReader br = new BufferedReader(isr);
            //doc du lieu
            while (true){
                String line = br.readLine();
                if(line==null) break; //neu khong co du lieu
                System.out.println(line); //xuat ra man hinh
            }
        }catch (IOException E){
            E.printStackTrace();
        }
    }
}
