package ru.mirea.lab1;

import java.util.Scanner;

public class Ex_7 {
    public static int factorial(int n) throws Exception {
        if (n>20){
            throw new Exception("Number is too big");
        }
        int result = 1;
        for(int i = 1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter number for factorial: ");
        Scanner sc = new Scanner(System.in);
        int n;
            while(true){
                if(sc.hasNextInt()){
                    n = sc.nextInt();
                    break;
                }else{
                    System.out.println("Enter correct number");
                    sc.next();
                }
            }

            System.out.printf("Factorial for number %s is %s",n,Ex_7.factorial(n));
    }
}
