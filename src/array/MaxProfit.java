package array;
import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int majority = maxprofit(arr, size);
        System.out.println("The max possible profit is: "+ majority);

    }
    //we use the algorithm that we find the maximum element from the right of the array
    //we then iterate the arr from the left, and we continuously find the maximum profit
    // time complexity is of order n^2;

    //second approach is using an additional array.
//    public static int maxprofit(int[] arr, int size) {
//        int currentdiff=0,maxdiff=Integer.MIN_VALUE;
//        int[] rightmax = new int[size];
//        rightmax[size-1]=arr[size-1];
//        for(int i=size-2; i>=0; i--) {
//            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
//        }
//        for(int i=0; i<size-1; i++) {
//            currentdiff = rightmax[i+1] - arr[i];
//            maxdiff = Math.max(maxdiff,currentdiff);
//        }
//        return maxdiff;
//    }

    //final approach is that we should traverse the array and find minimum price so far.
    // we then find the profit with each element of the array and save the max profit.
    public static int maxprofit(int[] arr, int size) {
        int minSoFar = arr[0];
        int currentPro = 0;
        int maxPro = Integer.MIN_VALUE;
        for(int i=1; i<size; i++) {
            minSoFar = Math.min(minSoFar,arr[i]);
            currentPro = arr[i] - minSoFar;
            maxPro = Math.max(maxPro,currentPro);
        }
        return maxPro;
    }
}
