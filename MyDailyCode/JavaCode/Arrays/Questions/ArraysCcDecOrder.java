package Arrays.Questions;

public class ArraysCcDecOrder {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    // Selection sort
    public static void SelectionSort(int arr[]) {
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort
    public static void InsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out current position to insert
            while(prev>=0 && arr[prev] < curr){
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev+1] = curr;
        }
    }






    public static void main(String [] args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
        printArr(arr);

    }
}
