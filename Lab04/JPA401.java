package Lab04;
import java.util.Scanner;
public class JPA401 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入10個整數：");
        int [] profil=new int[10];
        double s=0;
        double b=0;
        for (int i=0;i<=9;i++) {
            System.out.printf("請輸入第%d個整數：",i+1);
            int a=scn.nextInt();
            profil[i]=a;
            if (a>60) {
                s+=a;
                b++;
            }
        }
        double avg=s/b;
        System.out.printf("陣列中大於60的有%.0f個\n",b);
        System.out.printf("總合為%.0f\n",s);
        System.out.printf("平均值為%f",avg);
        scn.close();
    }
}
