package Lab02;

import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;
        while (i<=4) {
            System.out.print("Input Chinese socer:");
            int a=s.nextInt();
            System.out.print("Input English socer:");
            int b=s.nextInt();
            System.out.print("Input Math socer:");
            int c=s.nextInt();
            if (a<60) {
                System.out.println("Chinese failed.");
            }
            if (b<60) {
                System.out.println("English failed.");
            }
            if (c<60) {
                System.out.println("Math failed.");
            }
            if (a>60&b>60&c>60) {
                System.out.println("All pass.");
            }
            i++;
        }
        s.close();
    }
}
