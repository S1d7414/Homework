import java.util.Scanner;
public class JPA103 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please input:");
        float a=s.nextInt();
        float b=s.nextInt();
        float c=s.nextInt();
        float n;
        n=(a+b+c)/3;
        System.out.printf("Average: %.2f",n);
        s.close();
    }
}