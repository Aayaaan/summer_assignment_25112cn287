public class q04 {

    static int rev = 0;

    static void reverse(int n) {
        if (n == 0)
            return;

        rev = rev * 10 + n % 10;
        reverse(n / 10);
    }

    public static void main(String[] args) {

        int n = 1234;

        reverse(n);

        System.out.println(rev);
    }
}