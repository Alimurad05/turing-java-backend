package turing.edu.az.module01.eolymp;
import java.util.Scanner;
public class Hasil {
    public static long Interval(int a,int b) {
        long result = 1;
        for (int i = a; i <= b; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int a=-1,b=-1;
        for(int i=2;i<n;i++){
            for(int j=i;j<n;j++){
                if(Interval(i,j)==n){
                    a=i;
                    b=j;
                    break;
                }

            }
            if(a!=-1 && b!=-1) {
                break;
            }
        }
//        if(a==n){
//            System.out.println(-1);
//        }8
        System.out.println(a+ " " + b);
    }
}
