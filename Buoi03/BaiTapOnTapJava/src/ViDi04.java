import java.util.Scanner;

public class ViDi04 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap x: ");
        x = sc.nextInt();

        String check = (x%2==0)?"So Chan":"So Le";
        System.out.println(check);
    }
}
