public class JPA107 {
    public static void main(String argv[]) {
        int a=1,s=2,t=3;
        System.out.println("The basketball grade is "+ Basketball.calGrade(a,s,t));
        System.out.println("The baseball garde is "+ Baseball.calGrade(s,t));
    }
}
        class Basketball {
    public static int calGrade(int a,int s,int t)   {
         return a+s+t;
    }
}
class Baseball {
    public static int calGrade(int s,int t) {
        return 10+s+t;
            }
        }