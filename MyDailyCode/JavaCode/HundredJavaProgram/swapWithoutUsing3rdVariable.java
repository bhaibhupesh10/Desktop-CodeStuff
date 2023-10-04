package HundredJavaProgram;
import java.util.Scanner;
public class swapWithoutUsing3rdVariable {
    public static void main(String[] args) {
        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number x and y");
        x = scan.nextInt();
        y = scan.nextInt();

        System.out.println("int before swapping is \n x ="+x+ "\ny=" +y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("after swapping \n x = "+x+ "\n y = " +y);


    }
}
