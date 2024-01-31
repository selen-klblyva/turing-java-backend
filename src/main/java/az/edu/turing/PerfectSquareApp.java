package az.edu.turing;

import java.util.Scanner;

public class PerfectSquareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = findSquareRoot(n);
        System.out.println(result);
    }
    private static String findSquareRoot(int n) {
        int m = (int) Math.sqrt(n);
        if (m * m == n) {
            return String.valueOf(m);
        } else {
            return "No";
        }
    }
}