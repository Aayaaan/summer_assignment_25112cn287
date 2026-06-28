import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Delhi");
        System.out.println("2. Mumbai");
        int ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println("Q2. 5 + 3 = ?");
        System.out.println("1. 6");
        System.out.println("2. 8");
        ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println("Your Score = " + score);

        sc.close();
    }
}