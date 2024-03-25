package Lab02;

import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i=1;
        while (i<=4) {
            int a=s.nextInt();
            if (a%2==0 & a%3==0 & a%6==0) {
                System.out.printf("%d是2、3、6的倍數\n",a);
            }
            else if (a%2==0 & a%3==0) {
                System.out.printf("%d是2、3的倍數\n",a);
            }
            else if (a%2==0 & a%6==0) {
                System.out.printf("%d是2、6的倍數\n",a);
            }
            else if (a%3==0 & a%6==0) {
                System.out.printf("%d是3、6的倍數\n",a);
            }
            else if (a%2==0) {
                System.out.printf("%d是2的倍數\n",a);
            }
            else if (a%3==0) {
                System.out.printf("%d是3的倍數\n",a);
            }
            else if (a%6==0) {
                System.out.printf("%d是6的倍數\n",a);
            }
            else {
                System.out.printf("%d不是2、3、6的倍數\n",a);
            }
            i++;
        }
        s.close();
    }
}
