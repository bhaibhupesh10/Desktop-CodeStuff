package Arrays.TwoDArrays;

import java.util.Scanner;

public class matrices {

    // function to count element
//    public static void countOfElement(int matrix[][], int key){
//        int countOf = 0;
//        for(int i = 0;i<matrix.length;i++){
//            for(int j=0;j<matrix.length;j++){
//                if(matrix[i][j] == key){
//                    countOf++;
//                }
//            }
//        }
//        System.out.println("count " + countOf);
//    }

//     function to find largest element
    public static int findlargestElement(int matrix[][]) {
     int largestElement = matrix[0][0];
     for(int i =0;i<matrix.length;i++){
           for(int j = 0;j<matrix[0].length;j++){
               if(matrix[i][j]>largestElement){
                   largestElement = matrix[i][j];
               }
           }
       }
     return largestElement;
    }
    // function to search index of matrix
    public static boolean searchIndex(int matrix[][], int key){
        int countOfkey = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                if(matrix[i][j]==key) {
                    countOfkey++;
                    System.out.println("index of key: " + key + " : (" + i + " , " + j + " ) count: " + countOfkey );
//                        return true;
                }

            }
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("enter matrix");
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        // output
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // enter key to search
        System.out.println("enter key to search : ");
        int key = scan.nextInt();
        System.out.println("the largest element int the array  :" +findlargestElement(matrix));
//        searchIndex(matrix, key);
//        countOfElement(matrix, key);
        scan.close();
    }
}
