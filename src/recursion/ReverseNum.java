package recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int num=1234;
        int rev=reverseNum(num);
        System.out.println(rev);
    }

    private static int reverseNum(int num) {
        int dig= (int)Math.log10(num) +1;
        return helper(num,dig);
    }

    private static int helper(int num, int dig) {
        if(num < 10)
            return num;
        return (int) (num%10*Math.pow(10,dig-1)+ helper(num/10,dig-1));
    }
}




