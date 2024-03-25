import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入第1組的x和y座標:");
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("請輸入第2組的x和y座標:");
        float c=s.nextFloat();
        float d=s.nextFloat();
        double n;
        n=Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2));
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",a,b,c,d,n);
        s.close();
    }
}
