package searchandsort;

import java.util.Scanner;

public class LinearSearch{
    public static int searched(int a[], int n, int k){
        for(int i=0; i<n; i++){
            if(a[i] == k)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n=sc.nextInt();
            System.out.println("Enter the array element:");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println("Enter the element to be searched:");
            int k=sc.nextInt();
            int t=searched(a, n, k);
            System.out.println("The index is:" + t);
        }
    }
}


