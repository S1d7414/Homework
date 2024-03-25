package Lab02;

import java.util.Scanner;

public class JPA08 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i=1;i<=5;i++) {
            System.out.println("Input:");
            int a=s.nextInt();
            if (a>=90) {
                System.out.println("Your grade is A.");
            }
            else if (90>a&&a>=80) {
                System.out.println("Your grade is B.");
            }
            else if (80<a&&a>=70) {
                System.out.println("Your grade is C.");
            }
            else if (70<a&&a>=60) {
                System.out.println("Your grade is D.");
            }
            else if (a<60) {
                System.out.println("Your grade is F.");
            }
        }
        s.close();
    }
}
