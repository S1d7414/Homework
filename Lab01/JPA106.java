public class JPA106 {
    public static void main(String[] args) {
        f(-3.2);
        f(-2.1);
        f(0);
        f(2.1);
    }
    public static double f(double x) {
        double y=3*(x*x*x)+2*x-1;
        System.out.printf("f(%.1f) = %.4f\n",x,y);
        return x;
    }
}