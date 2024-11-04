package turing.edu.az.module02;
import java.util.Scanner;

public class Firstorlast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int first=number/100;
        int last=number%10;
        if(first>last) System.out.println(first);
        else if(last>first) System.out.println(last);
        else System.out.println("=");
    }
}