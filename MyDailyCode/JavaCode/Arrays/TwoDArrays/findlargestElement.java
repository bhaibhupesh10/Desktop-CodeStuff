package Arrays.TwoDArrays;

public class findlargestElement {
    public static void main(String[] args) {
        int[] matrix = {5, 12, 17, 9};

        int largestElement = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > largestElement) {
                largestElement = matrix[i];
            }
        }
        System.out.println("The largest element in the 2D array is: " + largestElement +"at index: " );

    }
}


