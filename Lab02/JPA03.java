package Lab02;

import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;
        while (i<=2) {
        System.out.println("Input an integer:");
        int a=s.nextInt();
        if (a%2==0) {
            System.out.println("The number is odd.");
            }
        else if (a%2!=0) {
            System.out.println("The number is even.");
            }
            i++;
        }
        s.close();
    }
}