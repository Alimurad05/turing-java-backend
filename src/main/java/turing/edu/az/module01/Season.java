package turing.edu.az.module01;
import java.util.Scanner;
public class Season
{
    public static void main(String[] args) {
        String st1="Spring";
        String st2="Summer";
        String st3="Autumn";
        String st4="Winter";
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        if(a>=3 && a<=5) System.out.println(st1);
        else if(a>=6 && a<=8) System.out.println(st2);
        else if(a>=9 && a<=11) System.out.println(st3);
        else if(a==1 || a==2 || a==12) System.out.println(st4);
    }
}