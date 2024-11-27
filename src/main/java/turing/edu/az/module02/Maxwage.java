package turing.edu.az.module02;
import java.util.Scanner;
public class Maxwage
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        double[] wages=new double[n];
        for(int i=0;i<n;i++){
            wages[i]=scan.nextDouble();
        }
        double max=wages[0];
        for(int i=0;i<n;i++){
            if(wages[i]>max){
                max=wages[i];
            }
        }
        System.out.printf("%.2f",max);
    }
}
