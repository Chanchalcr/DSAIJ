package recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibo(int n) {

        if (n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the fibonacci number to be printed");
        int n= sc.nextInt();
        System.out.println(fibo(n));
    }
}
