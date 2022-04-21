package searchandsort;
import java.util.Scanner;
public class BinarySearch{
    public static int searched(int[] a, int n, int k){
        int high=n-1, low=0, mid;
        while (high>=low){
            mid=(high+low)/2;
            if(k == a[mid]){
                return mid;
            }
            else if(k > a[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n=sc.nextInt();
            System.out.println("Enter the array element:");
            int[] a =new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println("Enter the element to be searched:");
            int k=sc.nextInt();
            int t=searched(a, n, k);
            System.out.println("The index is:" + t);
        }
    }
}


