package Lab02;

import java.util.Scanner;

public class JPA02 {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;
        while (i<=2) {
            System.out.println("Input:");
            int a=s.nextInt();
            int b=s.nextInt();
            if (a>b) {
               System.out.printf("%d is larger than %d\n",a,b);
            }
            else {
               System.out.printf("%d is larger than %d\n",b,a);
            }
            i++;
         }
         s.close();
   }
}