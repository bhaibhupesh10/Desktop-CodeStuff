package RandomQuestionSolving;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3, 4, 5, 6};
//        System.out.println(arr.length-1);
        int reverse = 0;
        for(int i = 0;i<arr.length;i++){
            reverse = arr[arr.length-1- i];
            System.out.print(reverse+ " ");
        }
    }
}
