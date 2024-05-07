package Lab05;
import java.util.Scanner;
public class JPA501 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0<=n<=16):");
            int a=scn.nextInt();
            if (a==999) {
                break;
            }
            System.out.print(a+"的階乘 = "+fac(a)+"\n");
        }
        scn.close();
    }
    
    public static int fac(int i) {
        if (i==0) {
            return 1;
        }
        else {
            return i*fac(i-1);
        }
    }
}