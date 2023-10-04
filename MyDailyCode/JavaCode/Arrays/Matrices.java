package Arrays;
import java.util.Scanner;
public class Matrices {

    public static boolean Search(int matrix[][], int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found in the index ( "+i+ ", "+j+ ")");


                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner Scan = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Scan.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);
    }
}
