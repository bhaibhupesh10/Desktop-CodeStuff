import java.util.Scanner;
public class whileLoopStar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter for number of rows");

        int rows = scan.nextInt(); // number of rows in the triangle
        System.out.println("enter for number of columns");
        int i = scan.nextInt();
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
