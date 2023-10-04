package HundredJavaProgram;
import java.util.Scanner;
public class If_elseClause2 {
    public static void main(String args[])
    {
        int marksObtained, passingMarks;
        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if(marksObtained >= passingMarks) {
            System.out.println(" You passed the exam");}
            else
            {
                System.out.println("unfortunately you failed to pass the exam ");
            }
        }
    }
