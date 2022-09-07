package searchandsort;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 11;
        System.out.println(binary(arr, key));
    }

    private static int binary(int[] arr, int key) {
        return recursion(arr, 0, 9, key);
    }

    private static int recursion(int[] arr, int l, int r, int key) {

        int mid = l + (r-l)/2;
        //base conditions
        if(l>r) return -1;
        if(arr[mid] == key) {
            return mid;
        }

        if(arr[mid] < key) {
            return recursion(arr, mid+1, r, key);
        } else {
            return recursion(arr, l, mid-1, key);
        }
    }
}
