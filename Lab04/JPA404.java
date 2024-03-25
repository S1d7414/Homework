package Lab04;
import java.util.Scanner;
public class JPA404 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []f= new int[10];
  
        f[0]=scn.nextInt();
        f[1]=scn.nextInt();
        for(int i=2;i<f.length;i++){
            f[i]=f[i-1]+f[i-2];
            System.out.println(f[i]);
        }
        scn.close();
    }
}