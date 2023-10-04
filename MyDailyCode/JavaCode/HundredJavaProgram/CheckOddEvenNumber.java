package HundredJavaProgram;
import java.util.Scanner;
public class CheckOddEvenNumber {
    public static void main (String[] args)
    {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number x and y");
        x = scan.nextInt();
       // y = scan.nextInt();

        if(x % 2==0) {
            System.out.println("entered number is even");
        }
        else
        {
            System.out.println("entered number is odd");
        }

    }
}
