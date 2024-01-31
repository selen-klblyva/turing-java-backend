package az.edu.turing;

import java.util.Scanner;
public class SquareRootApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r1=n%10;
        int r2=(n/10)%10;
        int r3=n/100;
        float total=r1+r2+r3;
        System.out.printf("%.3f",Math.sqrt(total));

    }
}

