public class q02 {
    public static void main(String[] args) {

        for (double n = 2; n <= 10000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                System.out.println(n);
            }
        }
    }
}