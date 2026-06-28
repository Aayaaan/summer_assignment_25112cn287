public class q02 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {2, 1}
        };

        boolean symmetric = true;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                if (a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}