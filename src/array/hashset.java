//this is a program to find the two number that has been repeated and
//is not present in the array of first n natural numbers.

package array;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the array:");
        int []arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        int []ans= new int[2];
        ans= findTwoElement(arr,n);

        System.out.println("the two number are:" + ans[0] + " " + ans[1]);
    }
    public static int[] findTwoElement(int arr[], int n) {

        int []ans =new int[2];
        int x=0,y=0,sum1=0,sum2=0;
        sum1 = (n*(n+1))/2;

        //finding number that occurs two times(y) with the help of hashSet
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(!hs.add(arr[i])) y=arr[i];
        }

        //find the actual sum of the array
        for(int i=0; i<n; i++){
            sum2 += arr[i];
        }
        //finding number that did not occur using formula sum2=sum1-x+y
        x = sum1+y-sum2;

        //adding the two numbers to the ans array and returning the array
        ans[0]=y;
        ans[1]=x;
        return ans;
    }
    //other approach
    //    int[] findTwoElement(int arr[], int n) {
    //        // code here
    //        int[] res=new int[2];
    //        for (int i=0;i<n;i++){
    //            if (arr[Math.abs(arr[i])-1]<0){
    //                res[0]=Math.abs(arr[i]);
    //            }else {
    //                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
    //            }
    //        }
    //        for (int i=0;i<n;i++){
    //            if (arr[i]>0){
    //                res[1]=i+1;
    //            }
    //        }
    //        return res;
    //    }
}
