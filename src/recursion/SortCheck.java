package recursion;

public class SortCheck {
    public static void main(String[] args) {
        int[] arr = {0 ,2,3,5,10};
        if(isSorted(arr))
            System.out.println("the array is sorted");
        else
            System.out.println("the array is not sorted");
    }

    public static boolean isSorted(int[] arr) {
        if(helper(arr,0))
            return true;
        return false;
    }
    public static boolean helper(int[] arr, int i) {
        if(i == arr.length-1)
            return true;
        if(arr[i] > arr[i+1])
            return false;
        return helper(arr,i+1);
    }
}
