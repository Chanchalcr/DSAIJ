package stringsJava;

public class Solution {
    public static void main(String[] args){
        String st = "fvaedcb";
        String newSt = biggerIsGreater(st);
        System.out.println(newSt);
    }
    public static String biggerIsGreater(String w) {
        // Write your code here
        for (int i = w.length() - 1; i > 0; i--) {
            if(w.charAt(i) > w.charAt(i-1)) {
                char temp = w.charAt(i-1);
                int t = w.length()-1;
                while (t >= i) {
                    if(w.charAt(t) > temp) {
                        break;
                    }
                    t--;
                }
                System.out.println(w.charAt(t));
                w = w.replace(w.charAt(i-1),w.charAt(t));
                w = w.replace(w.charAt(t),temp);
                t = i;
                int len = w.charAt(w.length()-1);
                while(t<=(w.length()-i+1)/2) {
                    w = w.replace(w.charAt(t++),w.charAt(len--));
                }
                return w;
            }
        }
        return "no answer";
    }
}

