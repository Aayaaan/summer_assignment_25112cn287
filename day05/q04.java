public class q04 {
    public static void main(String[] args) {

        int n = 84;
        int largest = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {

                int j;
                for (j = 2; j < i; j++) {
                    if (i % j == 0)
                        break;
                }

                if (j == i) {
                    largest = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
    }
}