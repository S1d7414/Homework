package Lab03;
import java.util.Scanner;
public class JPA05 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    for (int i=1;i<=3;i++) {
        System.out.print("Please enter one value.");
        int a=s.nextInt();
        int b=1;
        int c=0;
        if  (a<=10&&a>=1) {
            for (int j=1;j<=a;j++) {
            c=j*b;
            b=c;
            }
        }
        else {
            System.out.println("Error,the value is out of range.");
        }
        System.out.println(a+"!: "+c);
    }
    s.close();
   } 
}
