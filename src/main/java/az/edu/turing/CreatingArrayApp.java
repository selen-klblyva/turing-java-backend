import java.util.Scanner;

public class CreatingArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array=new int[n];
        int i,j;
        for(i=0;i<array.length;i++){
                array[i]=scanner.nextInt();
            }
        for(i=0;i<array.length;i++){
            if(array[i]>0){
                array[i]+=2;
            }
            else{
                array[i]=array[i];
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}