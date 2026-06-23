public class q04 {

    static boolean perfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        if (perfect(6))
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}