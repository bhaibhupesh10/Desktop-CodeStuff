package RandomQuestionSolving;

import java.util.Scanner;
public class palindromeNum {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            scanner.close();

            if (isPalindrome(input)) {
                System.out.println("'" + input + "' is a palindrome.");
            } else {
                System.out.println("'" + input + "' is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String input) {
            // Remove spaces and convert to lowercase
            input = input.replaceAll("\\s", "").toLowerCase();
            int left = 0;
            int right = input.length()-1;
            while(left<right){
                if(input.charAt(left)!=input.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

