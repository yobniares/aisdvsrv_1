package ru.mirea.lab1;

import java.util.Random;

public class Ex_3 {
    static int Vol = 10;
    public static void main(String[] args){

        int[] arr = new int[Vol];

        System.out.print("Array is: [");
        for (int i=0;i<Vol;i++){
            arr[i]= new Random().nextInt(0,100);
            System.out.printf("%s, ",arr[i]);
        }
        System.out.printf("]\n");


        float sum = 0;

        for (int i=0;i<Vol;i++){
            sum+=arr[i];
        }

        float avg = sum / Vol;

        System.out.printf("Sum of elements: %s\nAverage: %s",sum, avg);

    }
}
