package ru.mirea.lab1;

import java.util.Scanner;

public class Ex_4 {

        static int Vol = 10;
        public static void main(String[] args){

            int[] arr = new int[Vol];

            System.out.printf("Enter %s integer numbers:\n",Vol);
            Scanner sc = new Scanner(System.in);
            for (int i=0;i<Vol;i++){
                while(true){
                    if(sc.hasNextInt()){
                        arr[i] = sc.nextInt();
                        break;
                    }else{
                        System.out.println("Enter correct number");
                        sc.next();
                    }
                }
            }

            System.out.print("Array is: [");
            for (int i=0;i<Vol;i++){
                System.out.printf("%s, ",arr[i]);
            }
            System.out.print("]\n");


            int min = arr[0];
            int max = arr[0];

            for (int i=1;i<Vol;i++){
                min = Integer.min(min,arr[i]);
                max = Integer.max(max,arr[i]);
            }


            System.out.printf("Max: %s\nMin: %s",max, min);

        }


}
