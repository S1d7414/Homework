package Lab04;

public class JPA405 {
    public static void main(String[] args) {
        String[] A = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("反轉陣列資料之前： ");
        for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println();
        reverse(A);
        System.out.print("反轉陣列資料之後： ");
        for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println();
    } 

    public static void reverse(String a[]) {
        String temp;
        int i=0;
        int j=(a.length-1);
        while(i<(a.length/2)){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;
          j--;
        }
    }
}