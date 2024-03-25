package Lab03;

public class JPA02 {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        int c=0;
        for (int i=1;i<=3;i++) {
            for (int j=1;j<=2;j++) {
                b=a*j;
                c+=b;
            }
        }
        System.out.println("count = "+c);
    }
}
