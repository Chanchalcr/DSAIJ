package stringsJava;

public class learn {
    public static void main(String[] args) {
        String str = "hello there!";
        String str1 = str.replace('l',str.charAt(str.length()-1));
        System.out.println(str1);
    }
}
