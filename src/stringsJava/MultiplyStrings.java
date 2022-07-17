package stringsJava;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String nums2 = "456";
        StringBuilder res = multiply(num1,nums2);
        System.out.println(res);
    }
    public static StringBuilder multiply(String num1, String num2) {
        StringBuilder r = new StringBuilder();
        int l1 = num1.length(),l2 = num2.length(),l3 = l1+l2;
        int[] n1 = new int[l1];
        int[] n2 = new int[l2];
        int[] res = new int[l3];
        for (int i = 0; i < l1; i++) {
            char ch = num1.charAt(i);
            n1[i] = Character.getNumericValue(ch);
        }
        for (int i = 0; i < l2; i++) {
            char ch = num2.charAt(i);
            n2[i] = Character.getNumericValue(ch);
        }
        int i = l1-1,j = l2-1,k,carry,product;
        while(j >= 0) {
            carry = 0; k = j; i = l1-1;
            while (i >= 0 || carry != 0) {
                product = (n1[i] * n2[j]) + carry;
                res[k] = product % 10 + res[k];
                k++;
                carry = product / 10;
                i--;
            }
            j--;
        }
        boolean flag = true;
        final int RADIX = 10;
        for (int l = 0; l < l3; l++) {
            if(flag) {
                if(res[l] != 0 ) {
                    flag = false;
                    r.append(Character.forDigit(res[l], RADIX));
                }
            } else {
                r.append(Character.forDigit(res[l], RADIX));
            }
        }
        return r;
    }
}