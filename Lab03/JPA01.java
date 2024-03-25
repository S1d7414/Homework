package Lab03;

import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input:");
        int a=s.nextInt();
        int b=0;
        int c=0;
        for (int i=1;i<=a;i++) {
            c=b+=i;
        }
        System.out.printf("1 + ... + %d = %d",a,c);
        s.close();
    }
}
