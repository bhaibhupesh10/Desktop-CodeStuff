package RandomQuestionSolving;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int row = 2, col = 3;
        int matrix[][]  = {{1, 2, 3}, {4, 5, 6}};
        int transpose[][] = new int[col][row];
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = matrix[row][col];
            }
        }
    }
}
