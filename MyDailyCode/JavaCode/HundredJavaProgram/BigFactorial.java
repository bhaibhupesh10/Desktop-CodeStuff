package HundredJavaProgram;
import java.util.Scanner;
import java.math.BigInteger;
public class BigFactorial {
    public static void main(String[]args)
    {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer");
        n = scan.nextInt();

        for(c =1; c<=n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "!="+fact);


    }
}
