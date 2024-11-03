package turing.edu.az.module02;
import java.util.Scanner;
public class SimpleProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print(number/10);
        System.out.print(" ");
        System.out.print(number%10);

    }
}
