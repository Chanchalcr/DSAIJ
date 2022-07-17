package twoPointer;

public class PairSumK {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5,6,6,10};
        int sum = 10;
        int ans = pairSum(arr,sum);
        System.out.println("the ans is: "+ans);
    }
    /* This is a two pointer question;
       We first initialise i and j pointer;*/
    public static int pairSum(int[]arr, int sum) {
        int ans = 0;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > sum) {
                j--;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                if (arr[i] != arr[i]) {
                    int count1 = 0, count2 = 0;
                    while (arr[i] == arr[i + 1]) {
                        count1++;
                        i++;
                    }
                    count1++;
                    i++;
                    while (arr[j] == arr[j - 1]) {
                        count2++;
                        j--;
                    }
                    count2++;
                    j--;
                    ans += (count1 * count2);
                } else {
                    int count = 1;
                    while (arr[i] == arr[i + 1]) {
                        count++;
                        i++;
                    }
                    i++;
                    ans += nCr(count, 2);
                }
            }
        }
        return ans;
    }
        public static int nCr(int n, int r)
        {
            return fact(n) / (fact(r) * fact(n - r));
        }
        public static int fact(int n)
        {
            int res = 1;
            for (int i = 2; i <= n; i++)
                res = res * i;
            return res;
        }
}
