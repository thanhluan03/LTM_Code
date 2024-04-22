package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.sql.SQLOutput;

public class ServerChat {
    public static void main(String[] args) {
        //tao ra server socket
        try{
            //tao ra server socket
            ServerSocket server = new ServerSocket(25000);
            System.out.println("Server dang chay tai port: 25000");

            while (true){
                Socket connection = server.accept();
                System.out.println("Chap nhan ket noi tu client");

                //lay stream doc du lieu
                InputStream is = connection.getInputStream();
                //lay stream de ghi du lieu
                OutputStream os = connection.getOutputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));

                System.out.println("-------------------------------------");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap 'exit' de thoat");
                System.out.println("Nhap noi dung de gui den client!!!!");
                while (true) {
                    // Đọc dữ liệu từ client va xuat ra man hinh
                    System.out.println(br.readLine());

                    // Server doc tin nhan tu ban phim

                    String input = scanner.nextLine();
                    if (input.equals("exit")) {
                        break;
                    }
                    // Gui tin nhan den client
                    pw.println("Server: " + input);
                    // Ep buoc du lieu truyen di ngay lap tuc
                    pw.flush();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
