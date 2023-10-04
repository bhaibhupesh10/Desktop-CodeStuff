package HundredJavaProgram;
import java.util.Scanner;
public class findLargestNum{
    public static void main(String args[])
    {
        int x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("entered the integers to find the largest one");
       x = scan.nextInt();
       y = scan.nextInt();
       z = scan.nextInt();

        if(x>y && x>z)
            System.out.println("x is largest number");
        else if(y>x && y>z)
            System.out.println("y is largest number");
        else if(z>y && z>x)
            System.out.println("z is largest number ");
        else
            System.out.println("entered number are not distinct");

    }
}