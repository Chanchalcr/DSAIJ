package Heap;
import java.util.ArrayList;
import java.util.Arrays;

//we only concern about the max heap
public class HeapImplement {
    public static void main(String[] args) {
        int[] A = {10,20,15,12,40,25,18};
        System.out.println(Arrays.toString(A));
//        buildHeap(A, A.length);
        heapSort(A, A.length);
        System.out.println(Arrays.toString(A));
    }
    private static void buildHeap(int[] A, int n) {
        for(int i = n/2; i >=0; i--) {
            heapify(A,n,i);
        }
    }
    private static void heapify(int[] A, int n, int i) {
        int larger = i;
        int l = i*2+1;
        int r = (i*2) +2;
        if(l < n && A[l] > A[larger])
            larger = l;
        if (r < n && A[r] > A[larger])
            larger = r;
        if(larger != i) {
            swap(A,larger,i);
            heapify(A,n,larger);
        }
    }

    private static void swap(int[] A, int larger, int i) {
        int temp = A[larger];
        A[larger] = A[i];
        A[i] = temp;
    }
    public static int delete(int[] A, int n) {

        int value = A[0];
        A[0] = A[n-1];
        n = n-1;

        int i = 0;
        while(i < n) {
            int l = (2*i)+1;
            int r = (2*i)+2;
            int larger = i;

            if(l < n && A[l] > A[larger])
                larger = l;

            if (r < n && A[r] > A[larger])
                larger = r;

            if(larger != i) {
                swap(A,larger, i);
            }else break;

            i = larger;
        }

        return value;
    }
    public static void heapSort(int[] A, int n) {
        buildHeap(A,n);
        for (int i = 0; i < n; i++) {
            int val = delete(A,n-i);
            A[n-i-1] = val;
        }
    }
}