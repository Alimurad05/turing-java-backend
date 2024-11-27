package turing.edu.az.module02;
import java.util.Scanner;
public class Neighbours
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] neighbours=new int[n];
        for(int i=0;i<n;i++){
            neighbours[i]=scan.nextInt();
        }
        int cem=0;
        for(int i=1;i<n-1;i++){
            if(neighbours[i]>neighbours[i-1] && neighbours[i]>neighbours[i+1]){
                cem++;
            }
        }
        System.out.println(cem);
    }
}
