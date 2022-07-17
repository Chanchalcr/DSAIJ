package stringsJava;
import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String newSrt = toUpperCase(str);
        System.out.print("The converted string is: " + newSrt);
    }
    public static String toUpperCase(String str) {
        String newStr = "";//use should use string builder
        for (int i = 0; i < str.length(); i++) {
            if(i == 0 || str.charAt(i-1)==' ') {
//                newStr.append(Character.toUpperCase(str.charAt(i)));
                newStr += ((char)(str.charAt(i)-32));
            } else {
                newStr += (str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
