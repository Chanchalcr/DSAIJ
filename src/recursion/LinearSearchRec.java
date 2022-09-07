package recursion;

import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,10,6};
        int k = 4;
        ArrayList<Integer> indexes = new ArrayList<>();
        indexes = linearSearchAllIndex(arr, k, 0);
        System.out.println("the index of "+ k+ " is "+ indexes);
    }

    private static ArrayList<Integer> linearSearchAllIndex(int[] arr, int k, int index) {
        ArrayList<Integer> i = new ArrayList<>();
        if(index == arr.length)
            return i;
        if(arr[index] == k)
            i.add(index);
        i.addAll(linearSearchAllIndex(arr, k,index+1));
        return i;
    }

    private static int linearSearch(int[] arr, int k) {
        return helper(arr,k,0);
    }

    private static int helper(int[] arr, int k, int i) {
        if(i == arr.length)
            return -1;
        if(arr[i] == k)
            return i;
        return helper(arr,k, i+1);
    }
}
