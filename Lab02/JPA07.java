package Lab02;

import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i=1;i<=4;i++) {
            System.out.println("請輸入三個整數；");
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if (a+b>c&a+c>b&b+c>a) {
              if (a*a+b*b==c*c|b*b+c*c==a*a|a*a+c*c==b*b) {
                System.out.println("直角三角形");
              }
              else if (a*a+b*b<c*c|b*b+c*c<a*a|a*a+c*c<b*b) {
                System.out.println("鈍角三角形");
              }
              else if (a*a+b*b>c*c|b*b+c*c>a*a|a*a+c*c>b*b) {
                System.out.println("銳角三角形");
              }
            else {
                System.out.println("不可以構成三角形");
            }
            }
        }
        s.close();
    }
}