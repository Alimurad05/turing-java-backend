package turing.edu.az.module02;
import java.util.Scanner;

public class Bucksinbankk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int sum=0, sum1=0;
        int a=0;
        while(money>=sum1){
            a++;
            sum=a+sum*2;
            sum1+=sum;



        }
        System.out.println(a);
    }
}