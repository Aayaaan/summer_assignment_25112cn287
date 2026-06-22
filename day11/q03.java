public class q03 {

    static boolean prime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        if (prime(7))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}