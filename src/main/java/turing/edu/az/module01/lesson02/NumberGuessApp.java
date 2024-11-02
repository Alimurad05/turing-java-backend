package turing.edu.az.module01.lesson02;

import java.util.Scanner;

public class NumberGuessApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int a;
        a = scan.nextInt();
        if (a % 2 == 0) System.out.println("eded cuttdur");
        else System.out.println("eded tekdir");
        if (a > 0) System.out.println("eded musbetdir");
        else if (a < 0) System.out.println("eded menfidir");
        else System.out.println("eded 0-a beraberdir");
    }
}
