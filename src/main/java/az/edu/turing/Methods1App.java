package az.edu.turing;

import java.util.Scanner;

public class Methods1App {
    /* public static void main(String[] args){
         char[] arr=new char[]{'a','b','c'};
         printArray(arr);
     }

     private static void printArray(char[] arr){
              for(int i=0;i<arr.length;i++){
                  System.out.printf(arr[i]+" ");
              }
     }

 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.trim());


    }


}
