package Lab03;
import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            int m=s.nextInt();
            if (m==999) {
                break;
            }
            int n=s.nextInt();
            if (n>m) {
                 int temp=m;
                 m=n;
                 n=temp;
            }
            for (int i=m;i<=m;i--) {
                if (m%i==0&&n%i==0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        s.close();
    }
}
