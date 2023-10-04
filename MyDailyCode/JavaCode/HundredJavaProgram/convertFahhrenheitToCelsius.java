package HundredJavaProgram;
import java.util.Scanner;
public class convertFahhrenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in Fahreinheit");
        temperature = scan.nextFloat();

        temperature = ((temperature- 32) * 5)/9;
        System.out.println("Temperature in celcius is " + temperature);

    }
}
