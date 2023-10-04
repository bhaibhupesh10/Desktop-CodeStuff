package Arrays.Questions;

import org.w3c.dom.ls.LSOutput;

public class selectionSortWObj {
    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1,};

        for (int i = 0; i < arr.length; i++) {
            int midPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[midPos] > arr[j]) {
                    midPos = j;
                }
            }
            int temp = arr[midPos];
            arr[midPos] = arr[i];
            arr[i] = temp;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
