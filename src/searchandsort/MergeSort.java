package searchandsort;
import java.util.*;
public class MergeSort {
//    public static void merge(int []a, int l, int mid, int r){
//        int i=l, j=mid+1, x=0;
//        int []arr= new int[r-l+1];
//        while(i <= mid && j <= r){
//            if(a[i] < a[j]){
//                arr[x++]=a[i++];
//            }else{
//                arr[x++]=a[j++];
//            }
//        }
//        while (i <= mid){
//            arr[x++]=a[i++];
//        }
//        while (j <= r){
//            arr[x++]=a[j++];
//        }
//        for(int m=0,n=l; m< arr.length; n++,m++){
//            a[l]=arr[m];
//        }
//    }
//    public static void mergesort(int []a, int l, int r){
//        int mid=(l+r)/2;
//        if(l >= r){
//            return;
//        }
//        mergesort(a,l,mid);
//        mergesort(a,mid+1,l);
//        merge(a,l,mid,r);
//    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            System.out.println("Enter the array element:");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println("The sorted array is:");
            mergesort(a, 0, n);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
    private static void mergesort(int[] a, int i, int n) {
        int mid = i + (n-i)/2;
        if(i==n){
            return;
        }
        mergesort(a,i,mid);
        mergesort(a,mid+1,n);
        merge(a,i,mid,n);
    }

    private static void merge(int[] a, int i, int mid, int n) {
        int[] b = new int[n-i];
        int k=0;
        int one=i,two=mid;
        while (one<mid && two<n) {
            if(a[one] <a[two]) {
                b[k++] = a[one++];
            } else {
                b[k++] = a[two++];
            }
        }
        while(one < mid) {
            b[k++]=a[one++];
        }
        while (two < n) {
            b[k++] = a[two++];
        }
        for (int j = 0; j < b.length; j++) {
            a[i+j] = b[j];
        }
    }
}