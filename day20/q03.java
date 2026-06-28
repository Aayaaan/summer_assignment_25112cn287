public class q03 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < 2; i++) {

            int sum = 0;

            for (int j = 0; j < 2; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}