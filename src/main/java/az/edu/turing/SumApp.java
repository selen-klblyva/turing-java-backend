package az.edu.turing;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long result1=Summ(a,b);
        System.out.println(result1);
    }
    public static Long Summ(long a,long b){
        long result=a*a+b*b;
        return result;

    }

}
