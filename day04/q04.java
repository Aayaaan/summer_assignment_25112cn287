public class q04 {
    public static void main(String[] args) {

        for (int n = 100; n <= 999; n++) {
            int num = n;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + (digit * digit * digit);
                num = num / 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}