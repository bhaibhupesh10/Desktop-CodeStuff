package HundredJavaProgram;
import java.util.Scanner;
public class IfElseClause {
    public static void main(String args[]) {
        boolean learning;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the true or false value");
        learning = scan.nextBoolean();
      //  boolean learning = false;
        if (learning == true)
        {
            System.out.println("java programmer");
        }
        else{
            System.out.println("what are you doing here..? ");
        }
    }
}
