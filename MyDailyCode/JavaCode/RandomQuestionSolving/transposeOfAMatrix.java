package RandomQuestionSolving;

public class transposeOfAMatrix {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int arr[][] = {{1, 2, 3},
                {5, 6, 7}};


        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        transposeMatrix(transpose);
    }
    public static void transposeMatrix(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

}
}