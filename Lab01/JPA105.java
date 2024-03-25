import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("請輸入您的名字:");
        String a=s.next();
        System.out.printf("Hi, %s,請輸入您的銅板數量:\n",a);
        System.out.print("請輸入1元的數量:");
        int x=s.nextInt();
        System.out.print("請輸入5元的數量:");
        int y=s.nextInt();
        System.out.print("請輸入10元的數量:");
        int z=s.nextInt();
        System.out.print("請輸入50元的數量:");
        int n=s.nextInt();
        int t=x*1+y*5+z*10+n*50;
        int q=t/1000;
        int w=(t-q*1000)/100;
        int e=(t-q*1000-w*100)/10;
        int r=t-q*1000-w*100-e*10;
        System.out.printf("您的錢總共有: %d 千 %d 百 %d 十 %d 元",q,w,e,r);
        s.close();
    }
}
