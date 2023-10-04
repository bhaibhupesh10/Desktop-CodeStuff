package HundredJavaProgram;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args)
    {
        int n , c , fact =1;
        Scanner scan = new  Scanner(System.in);
        System.out.println("enter the number to find the factorial");
        n = scan.nextInt();
        if(n<0) {
            System.out.println("the number should not be negative");
        }
        else{
            for( c = 1;c<=n;c++)
                fact = fact*c;
            System.out.println("factorial of "+n+ " is = " +fact );


        }
    }
}
