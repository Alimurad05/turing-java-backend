package turing.edu.az.module02;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
   for(int i=1;i<=n;i++){
       for(int j=1;j<=i;j++){
           System.out.print("*");
       }
       System.out.println();
   }
        System.out.println();
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}