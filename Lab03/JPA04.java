package Lab03;

import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float b=0;
        int c=1;
        while (true) {
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            float a=s.nextInt();
            if (a==-1) {
                break;
            }
            b+=a;
            c++;
        }
        System.out.printf("餐點總費用:%.1f\n",b);
        System.out.printf(c-1+" 道餐點平均費用為: %.2f",b/(c-1));
        s.close();
    }
}
