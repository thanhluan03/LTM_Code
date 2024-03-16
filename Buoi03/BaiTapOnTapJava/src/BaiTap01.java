import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao a: ");
            a = sc.nextDouble();

        }while (a==0);

        System.out.println("Nhap vao b: ");
        b = sc.nextDouble();

        System.out.println("Nhap vao c: ");
        c = sc.nextDouble();

        //tinh delta
        //double delta = b*b - 4*a*c

        double delta = Math.pow(b, 2) - 4*a*c;

        if(delta<0){
            System.out.println("PT vo nghiem!");
        }else if (delta==0){
            double x = -b/(2*a);
            System.out.println("PT co nghiem kep x = " +x);
        }else {
            double x1, x2;
            x1 = ( -b + Math.sqrt(delta) )/(2*a);
            x2 = ( -b - Math.sqrt(delta) )/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
