public class q04 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        for (int j = 0; j < 2; j++) {

            int sum = 0;

            for (int i = 0; i < 2; i++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}