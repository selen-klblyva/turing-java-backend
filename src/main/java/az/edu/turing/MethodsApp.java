package az.edu.turing;

import java.util.Scanner;

public class MethodsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double a1 = scanner.nextDouble();
        int b1 = scanner.nextDouble();

        int result = SumofNumbers(a, b);
        double result1 = SumofNumbers1(a1, b1);
    }

    private static int SumofNumbers(int a, int b) {
        return 2 * (a + b);
    }

    private static double SumofNumbers1(double a1, double b1) {
        return 2 * (a1 + b1);
    }

}
