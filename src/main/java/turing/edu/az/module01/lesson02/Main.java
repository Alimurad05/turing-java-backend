package turing.edu.az.module01.lesson02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        a= scan.nextInt();
        switch (a){
            case 1:
                System.out.println("Yanvar ayi ve qis feslidir");
                break;
            case 2:
                System.out.println("Fevral ayi ve qis feslidir");
                break;
            case 12:
                System.out.println("Dekabr ayi ve qis feslidir");
                break;
            case 3:
                System.out.println("Mart ayi ve yaz feslidir");
                break;
            case 4:
                System.out.println("Aprel ayi ve yaz feslidir");
                break;
            case 5:
                System.out.println("May ayi ve yaz feslidir");
                break;
            case 6:
                System.out.println("Iyun ayi ve yay feslidir");
                break;
            case 7:
                System.out.println("Iyul ayi ve yay feslidir");
                break;
            case 8:
                System.out.println("Avqust ayi ve yay feslidir");
                break;
            case 9:
                System.out.println("Sentyabr ayi ve payiz feslidir");
                break;
            case 10:
                System.out.println("Oktyabr ayi ve payiz feslidir");
                break;
            case 11:
                System.out.println("Noyabr ayi ve payiz feslidir");
                break;
            default:
                System.out.println("zehmet olmasa 1-12 arasi eded daxil edin");




        }


    }
}

