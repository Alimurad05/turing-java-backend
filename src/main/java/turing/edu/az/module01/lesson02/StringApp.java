package turing.edu.az.module01.lesson02;

public class StringApp {
    public static void main(String[] args){
        int a=5;
        int b=5;
        String name1="Turing";
        String name2="Turing";
        String name5="TURING";
        //poolda yaradib 2si de 1ine referans edir
        String name3=new String("Turing");
        String name4=new String("Turing");

        // primitiv tiplerde == velue baxir referensde adresslere baxir
        //poolun xaricinde yaradib 2si de ferqli yere referans edir
        System.out.println(name1==name3); // false verir cunki == isaresi adresslere baxir
        System.out.println(name1.equals(name3)); // true verir cunki equal adresse yox value a baxir
        System.out.println(a==b); //true verir(niyesini arasdir)
        name1=name1.toUpperCase();
        System.out.println(name1==name5);//false verir cunki method istifade olunubu method string poolda ne edirarasdir
        //stringbuilder string buffer string hamsi arasdir

    }

}
