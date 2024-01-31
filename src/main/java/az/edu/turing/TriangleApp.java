package az.edu.turing;

import java.util.Scanner;
public class TriangleApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if(a==b && b==c){
            System.out.println("1");
        }
        else if((a==b && b!=c)||(a==c && c!=b)||(b==c && c!=a)){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }
        }
    }
