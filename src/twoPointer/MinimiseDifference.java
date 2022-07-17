//We are given three sorted arrays, and we need to find three elements one from each array such that their max and
//min difference is minimised.
package twoPointer;
public class MinimiseDifference {
    public static void main(String[] args) {
        int[] a = {1,2,9,8,10,100};
        int[] b = {9,9,15,200};
        int[] c = {2,50,100,100,300};
        int ans = minimiseDiff(a,b,c);
        System.out.println("The minimum difference: " + ans);
    }

    //In this function we are start the iteration from the start of the arrays, and we will keep updating the minimum
    //number and calculate the max and min difference at each step!
    public static int minimiseDiff(int[] a,int[] b,int[] c) {
        int currentDiff,minDiff=Integer.MAX_VALUE;
        int i=0,j=0,k=0;
        while (true) {
            int m = 1;
            if(i<a.length && j<b.length && k<c.length) {
                currentDiff = diff(a[i], b[j], c[k]);
                minDiff = Math.min(minDiff, currentDiff);
                m = miniArr(a[i], b[j], c[k]);
            }
            if((m==1 && i==a.length-1) || (m==2 && j==a.length-1) || (m==3 && k==a.length-1)){
                break;
            }
            if(m==1) {
                i++;
            } else if (m==2) {
                j++;
            } else {
                k++;
            }
        }
        return minDiff;
    }
    public static int diff(int a,int b,int c) {
        return Math.abs(max(a,b,c)-mini(a,b,c));
    }
    public static int mini(int a, int b, int c) {
        if(a<b && a<c) {
            return a;
        } else if( b<a && b<c) {
            return b;
        }
        return c;
    }
    public static int max(int a, int b, int c) {
        if(a>b && a>c) {
            return a;
        } else if( b>a && b>c) {
            return b;
        }
        return c;
    }
    public static int miniArr(int a, int b, int c) {
        if(a<b && a<c) {
            return 1;
        } else if( b<a && b<c) {
            return 2;
        }
        return 3;
    }
}
