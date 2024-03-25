package Lab02;

import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        System.out.println("Please enter scoer");
        Scanner s=new Scanner(System.in);
        int i=1;
        while (i<=2) {
            int n=s.nextInt();
            if (n>=60) {
                System.out.println("You pass");
                System.out.println("end");
            }
            else {
                System.out.println("end");
            }
            i++;
        }
        s.close();
    }
}