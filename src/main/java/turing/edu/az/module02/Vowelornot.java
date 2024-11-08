package turing.edu.az.module02;
import  java.util.Scanner;
public class Vowelornot {
    public static void main(String[] args){
        String st;
        Scanner scan= new Scanner(System.in);
        st=scan.nextLine();
        char a='a';
        char e='e';
        char i='i';
        char o='o';
        char u='u';
        char ch = Character.toLowerCase(st.charAt(st.length()-1));
        if(ch==a || ch==e || ch==i || ch==o || ch==u ){
            System.out.println("The last character is Vowel");
        }
        else System.out.println("The last character is not vowel");

    }
}
