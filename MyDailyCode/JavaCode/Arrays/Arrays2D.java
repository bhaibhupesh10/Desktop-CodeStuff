package Arrays;
import java.util.Scanner;
public class Arrays2D {
    public static boolean SearchInArr(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at the index (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("enter matrix values: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        SearchInArr(matrix, 8);
    }
}
