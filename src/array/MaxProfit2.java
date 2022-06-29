package array;

import java.util.Scanner;
public class MaxProfit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int majority = maxProfit(arr);
        System.out.println("The max possible profit is: "+ majority);
    }

        /* We have to find all the local minima's and all the local maxima's and calculate their profit
        and then add the profits to find the max possible profit. */
        public static int maxProfit(int[] prices) {
            int profit = 0;
            for (int i = 0; i < prices.length-1; i++) {
                if (prices[i + 1] > prices[i]) {
                    profit += (prices[i + 1] - prices[i]);
                }
            }
            return profit;
        }
}
