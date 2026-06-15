public class q04 {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;
        int lcm = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                lcm = i;
            }
        }
        System.out.println("LCM = " + lcm);
    }
}