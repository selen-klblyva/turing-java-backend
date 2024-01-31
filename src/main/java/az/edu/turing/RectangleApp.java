package az.edu.turing;
import java.util.Scanner;
public class RectangleApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[][] matrix=new String[n][3];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<3;j++){
                matrix[i][j]="#";
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
