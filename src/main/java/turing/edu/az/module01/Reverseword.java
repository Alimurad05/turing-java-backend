package turing.edu.az.module01;
import  java.util.Scanner;
public class Reverseword {
    public static void main(String[] args) {
        String st;
        Scanner scan = new Scanner(System.in);
        st = scan.nextLine();
        String st2 = st.toUpperCase();
        for (int i = st2.length() - 1; i >= 0; i--) {
            System.out.print(st2.charAt(i));
        }

    }
}