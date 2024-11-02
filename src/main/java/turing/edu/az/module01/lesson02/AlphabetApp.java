package turing.edu.az.module01.lesson02;

public class AlphabetApp {
    public static void main(String[] args) {
        for (char ch = 'a', CH = 'A'; ch <= 'z' && CH <= 'Z'; ch++, CH++) {
            System.out.println(ch + " " + CH + " ");
        }
    }
}
