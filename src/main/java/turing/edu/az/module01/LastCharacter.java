package turing.edu.az.module01;
import  java.util.Scanner;
public class LastCharacter {
    public static void main(String[] args){
    String st;
    Scanner scan= new Scanner(System.in);
    st=scan.nextLine();
    char ch=st.charAt(st.length()-1);
    System.out.println(ch);
}
}