package turing.edu.az.module02;
import java.util.Scanner;
public class MaxElement
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int max=arr[0];
        int cem=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i+1;

            }
        }
         System.out.println(max+" "+index);

    }
}
