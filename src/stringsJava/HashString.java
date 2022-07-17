package stringsJava;

import java.util.HashMap;

public class HashString {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abfff";
        int ans =0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i< str1.length(); i++) {
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        for(int i=0; i< str2.length(); i++) {
            char ch = str2.charAt(i);
            if(hm.get(ch) == null) {
                ans ++;
            } else {
                if(hm.get(ch)==1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch)-1);
                }
            }
        }
        System.out.println(ans);
    }
}
