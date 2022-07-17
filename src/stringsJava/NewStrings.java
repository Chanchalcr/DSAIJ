package stringsJava;

import java.util.HashMap;
import java.util.HashSet;

public class NewStrings {
    public static void main(String[] args) {
        String str = new String("bacda");
        int k=3;
        int ans = getLengthofLongestSubstring(str,k);
        System.out.println(ans);
    }
    public static int getLengthofLongestSubstring(String s, int k) {
        int ans = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int i=-1;
        int j=-1;
        while(true) {
            boolean flag1 = false;
            boolean flag2 = false;
            while(i < s.length() - 1) {
                flag1 = true;
                i++;
                char ch = s.charAt(i);
                hm.put(ch,hm.getOrDefault(ch,0) + 1);
                if (hm.size() <= k) {
                    int len = i-j;
                    if(ans < len) {
                        ans = len;
                    }
                } else {
                    break;
                }
            }
            while (j < i) {
                flag2 = true;
                j++;
                char ch = s.charAt(j);
                if(hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch,hm.get(ch)-1);
                }
                if(hm.size() > k) {
                    continue;
                } else {
                    int len = i-j;
                    if(ans < len) {
                        ans = len;
                    }
                    break;
                }
            }
            if(!flag1 && !flag2) {
                break;
            }
        }
        return ans;
    }
}
