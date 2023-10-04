package RandomQuestionSolving;

import java.util.Locale;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = scan.nextInt();
        if(isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number ");
        } else {
            System.out.println(number + " is not a Armstrong number");
        }
        isArmstrong(number);
        }
    public static boolean isArmstrong(int number){
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while(number>0){
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
