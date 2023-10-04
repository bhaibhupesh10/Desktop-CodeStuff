package HundredJavaProgram;
import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
    public static void main( String args[]) {

        String num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the two numbers num1 and num2");
        num1 = scan.nextLine();
        num2 = scan.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;
        sum = first.add(second);

        System.out.println("the sum of two large number is =" + sum);
    }
}
