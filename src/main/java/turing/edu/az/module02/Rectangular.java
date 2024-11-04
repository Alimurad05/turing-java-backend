package turing.edu.az.module02;
import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if( a*a+b*b==c*c || a*a+c*c==b*b || c*c+a*a==b*b || c*c+b*b==a*a) System.out.println("YES");
        else System.out.println("NO");

    }
}
