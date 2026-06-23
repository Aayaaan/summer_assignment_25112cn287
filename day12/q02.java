public class q02 {

    static boolean armstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        if (armstrong(153))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}