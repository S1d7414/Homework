package Lab05;
import java.util.Scanner;
public class JPA505 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=2; 
        int b=3;
        double c=5.2;
        double d=4.3;
        String e="I love";
        String f="Java!!";
        add(a,b);
        add(c,d);
        add(e,f);
        System.out.printf("%d %.6f %s",a+b,c+d,e+" "+f);
        scn.close();
    }

    public static void add(int i,int j) {
        System.out.println("Adding two integer: "+i+" , "+j);
    }
    public static void add(double m,double n) {
        System.out.println("Adding two doubles: "+m+" , "+n);
    }
    public static void add(String x,String y) {
        System.out.println("Adding two strings: "+x+" "+y);
    }
}