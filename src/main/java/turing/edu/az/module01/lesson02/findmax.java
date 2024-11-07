package turing.edu.az.module01.lesson02;

import java.util.Scanner;

public class findmax {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] numbers={1,2,3,4,87,6};
            int max=numbers[0];
            for (int i=0;i<numbers.length;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            System.out.println(max);
        }

    }

