import java.util.Scanner;

public class JPA102 {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input:");
        float a=scn.nextFloat();
        double b;
        b=a*2.20462;
        System.out.printf("%.1f kg = %.4f ponds",a,b);
        scn.close();
   } 
}
