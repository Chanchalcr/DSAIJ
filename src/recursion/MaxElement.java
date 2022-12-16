package recursion;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,9,6};
        int ans = max(arr, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int max(int[] arr, int l, int r) {
        if(l >= r) return arr[l];
        int mid = (l+r)/2;
        return Math.max(max(arr, l, mid),max(arr, mid+1, r));
    }
}
