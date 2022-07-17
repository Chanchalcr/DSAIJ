package stringsJava;

public class Palindrome {
    public static void main(String[] args) {
        String str = "pollop";
        boolean flag = isPallin(str);
        if(flag) {
            System.out.println(str + " is a Palindrome word!");
        } else {
            System.out.println(str + " is not a Palindrome word!");
        }
    }
    public static boolean isPallin(String str) {
        int i=0;
        while(i < str.length()/2) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
