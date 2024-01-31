package az.edu.turing;


import java.util.Scanner;
public class RectangularApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(Math.pow(c,2)==(int)Math.pow(a,2)+(int)Math.pow(b,2) || Math.pow(a,2)==(int)Math.pow(b,2)+(int)Math.pow(c,2) || Math.pow(b,2)==(int)Math.pow(a,2)+(int)Math.pow(c,2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
