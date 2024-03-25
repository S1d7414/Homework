package Lab02;

import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input:");
        int i=1;
        while (i<=2) {
        int a=s.nextInt();
        if (a%5==0 & a%9==0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        i++;
    }
    s.close();
    }
}
