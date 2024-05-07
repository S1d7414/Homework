package Lab05;
import java.util.Scanner;
public class JPA502 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0<=n<=16):");
            int i=scn.nextInt();
            if (i==999) {
                break;
            }
            System.out.print(i+"的階乘（迴圈）= "+facTail(i-1,i)+"\n");
            System.out.print(i+"的階乘（尾迴圈）= "+facTail(i-1,i)+"\n");
        }
        scn.close();
    }
    public static int facTail(int a,int b) {
        if (a==1) {
            return b;
        }
        else {
            return facTail(a-1,a*b);
        }
    }
}