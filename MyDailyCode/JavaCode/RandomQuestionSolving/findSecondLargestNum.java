package RandomQuestionSolving;

public class findSecondLargestNum {
        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 5, 6, 10};

            int secondLargest = findSecondLargest(arr);

//            System.out.println("Second largest number in the array: " + secondLargest);
            System.out.println(findSecondLargest(arr));
        }

        public static int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array should have at least two elements.");
                return -1; // Return a sentinel value indicating an error.
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num> secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }
    }

