package Lab04;
import java.util.Scanner;
public class JPA402 {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.print("請輸入學生人數：");
         int a=scn.nextInt();
         float [] profil=new float[a];
         float sum=0;
         for (int i=0;i<=a-1;i++) {
            System.out.printf("第%d個學生的成績：",i+1);
            float m=scn.nextFloat();
            profil[i]=m;
            sum+=profil[i];
         }
         double avg=sum/a;
         System.out.println("人數："+a);
         System.out.println("總分："+sum);
         System.out.printf("平均：%.6f",avg);
         scn.close();
    }
}
