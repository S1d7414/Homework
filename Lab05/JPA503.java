package Lab05;
import java.util.Scanner;
public class JPA503 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.print("Input m:");
            int a=scn.nextInt();
            if (a==999) {
                break;
            }
            System.out.print("Input n:");
            int b=scn.nextInt();
            System.out.printf("最大公因數=%d\n",gcd(a,b));
        }
        scn.close();
    }

    public static int gcd(int m,int n) {
        if (n==0) {
            return m;
        }
        else {
            return gcd(n,m%n);
        }
    }
}