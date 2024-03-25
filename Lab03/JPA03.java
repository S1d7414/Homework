package Lab03;

public class JPA03 {
    public static void main(String[] args) {
        int a,b=0;
        System.out.printf("1~1000中的完美數有: ");
        for (int i=1;i<=1000;i++) {
            a=i;
            b=0;
            for (int j=1;j<i;j++) {
                if (i%j==0) {
                    b+=j;
                }
            }
            if (a==b) {
                System.out.printf("%d ",a);
            }
        }
    }
}
