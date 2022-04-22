package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []a ={0,2,2,3,5,10};
        System.out.println(binary(a,10,0,5));
    }
    public static int binary(int []a, int x, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(a[mid] == x){
            return mid;
        }
        if(x < a[mid]){
            return binary(a, x, s, mid-1);
        }
        return binary(a, x, mid+1, e);
    }
}
