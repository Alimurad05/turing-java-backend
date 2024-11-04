package turing.edu.az.module02;
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number/1000 + number%10);
    }
}