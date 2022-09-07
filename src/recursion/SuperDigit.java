//in this question we find the
package recursion;

import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        String n = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int ans = superDig(n,k);
        System.out.println(ans);
    }

    private static int superDig(String n, int k) {
        n = n.repeat(k);
        int num=Integer.parseInt(n);
        return dig(num);
    }

    private static int dig(int num) {
        if(num<10) {
            return num;
        }
        return dig(sumOfDig(num));
    }

    private static int sumOfDig(int num) {
        if(num == 0) return num;
        return num%10 + sumOfDig(num/10);
    }
}

