package HundredJavaProgram;
import java.util.Scanner;
public class AddTwoNum {
    public static void main(String [] args){
        int x , z,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two integers to calculate their sum ");

        x = scan.nextInt();
        y = scan.nextInt();

        z = x+y;
        System.out.println("sum of the entered integers = " +z);
    }
}
