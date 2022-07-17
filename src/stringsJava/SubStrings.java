package stringsJava;
public class SubStrings {
    public static void main(String[] args) {
        String str = "abcde";
        allSubStrings(str);
    }
    public static void allSubStrings(String str) {
        StringBuilder name = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            name = new StringBuilder("");
            for (int j = i; j < str.length(); j++) {
                name.append(str.charAt(j));
                System.out.println(name);
            }
        }
    }
}
