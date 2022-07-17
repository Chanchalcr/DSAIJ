package array;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr  = {1,1,1};
        int ans = subarraySum(arr,2);
        System.out.println(ans);
    }
//    public static int subarraySum1(int[] nums, int k) {
//        int sum=0,ans=0;
//        int  i=0,j=0;
//        while(j<nums.length || i<nums.length) {
//            if(j<nums.length){
//                sum += nums[j++];
//            }
//            if(sum == k) {
//                ans++;
//                sum -= nums[i++];
//            } else if(sum > k) {
//                sum -= nums[i++];
//            }
//        }
//        return ans;
//    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum =0,count =0;
        hm.put(0,1);
        for (int num : nums) {
            sum += num;
            if (hm.containsKey(sum - k))
                count += hm.get(sum - k);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
