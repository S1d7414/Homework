package Lab03;
import java.util.Scanner;
import java.lang.Math;
public class JPA06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            double a=s.nextInt();
            if (a==999) {
                break;
            }
            double b=s.nextInt();
            double c=Math.pow(a,b);
            System.out.println(c);
        }
    s.close();
    }
}
