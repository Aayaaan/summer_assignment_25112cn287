public class q01 {

    static boolean palindrome(int n) {

        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {

        if (palindrome(121))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}