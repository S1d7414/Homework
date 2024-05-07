package Lab05;
import java.util.Scanner;
public class JPA504 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.print("Input the number:");
            int a=scn.nextInt();
            System.out.printf("Ans:%d\n",sum2(a));
            scn.close();
        }
    }
    
    public static int sum2(int m) {
        int sum=0;
        if (m==1) {
            return 2;
        }
        else {
            sum+=sum2(m-1)+2*m;
            return sum;
        }
    }
}