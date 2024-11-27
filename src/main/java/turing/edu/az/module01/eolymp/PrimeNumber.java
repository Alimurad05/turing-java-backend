package turing.edu.az.module01.eolymp;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number2=in.nextInt();
        int sum=0;
        for(int i=number;i<=number2;i++){
            boolean yoxla=true;
            for(int j=2;j<Math.sqrt(i);i++){
                if(i%j!=0 && i==13) yoxla=false;
            }
            if(yoxla){
            sum++;
            }
        }
        System.out.println(sum);
    }
}
