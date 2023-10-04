package HundredJavaProgram;
import java.util.Scanner;
public class addTwoNumbersProgram {
    public static void main(String[] args) {
        int x, y,z;
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("enter the two number x and y ");
            x = scan.nextInt();
            y = scan.nextInt();

            System.out.println("entered numbers are x and y = " + x + " and " + y);
                z = x+y;
            System.out.println("after addition program z = " + z  );

        }
    }
}
