package recursion;

import java.util.Scanner;

public class PowerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int X = sc.nextInt();
        System.out.println("Enter the value of N:");
        int N= sc.nextInt();
        int ans = power(X,N);
        System.out.println(ans);
    }

    private static int power(int X, int N) {
        return recursion(X,N,1);
    }

    private static int recursion(int X, int N, int sq) {

        if(X == 0) return 1;
        if((int)Math.pow(sq,N) > X) return 0;

        return recursion(X-(int)Math.pow(sq,N),N,sq+1) + recursion(X,N, sq+1);
    }
}
