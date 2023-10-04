package HundredJavaProgram;
import java.util.Scanner;
public class swap2noUsing3rdVariable {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("enter x and y ");
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        System.out.println("Before Swapping x \nx = " +x+ "\ny = "+y);

        temp = x;
        x = y;
        y  =   temp;
        System.out.println("After swapping x = " + x + "\ny = " + y );

    }
}
