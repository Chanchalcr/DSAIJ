package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=1234;
        int sum=sumOfDigit(num);
        System.out.println(sum);
    }

    private static int sumOfDigit(int num) {

        //base condition
        if(num<10)
            return num;

        return num%10+sumOfDigit(num/10);
    }
}
