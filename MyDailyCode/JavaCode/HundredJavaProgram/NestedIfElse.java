package HundredJavaProgram;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String [] args) {
//        int marksObtained, passingMarks;
//        char grade;
//        passingMarks = 40;
//        Scanner input = new Scanner(System.in);
//        System.out.println("input marks scored by you ");
//        marksObtained = input.nextInt();
//        if (marksObtained >= passingMarks){
//            if (marksObtained > 90)
//                grade = 'A';
//            else if (marksObtained > 75)
//                grade = 'B';
//            else if (marksObtained > 60)
//                grade = 'C';
//            else
//                grade = 'D';
//        System.out.println("you passed the exam and your grade is " + grade);
//    }
//        else {
//            grade = 'F';
//            System.out.println("you failed  and your grade is " + grade);

                int marksObtained, passingMarks;
                char grade;
                passingMarks = 40;
                Scanner input = new Scanner(System.in);
        System.out.println("enter your marks here");
        marksObtained = input.nextInt();
        if(marksObtained >= passingMarks) {
            if (marksObtained > 90)
                grade = 'A';

            else if (marksObtained > 75)
                grade = 'B';

            else if (marksObtained > 60)
                grade = 'C';

            else
                grade = 'D';
            System.out.println("you passed the exam with grade = "+grade);
        }
        else{
            grade= 'F';
            System.out.println("sorry you failed the exam and your grade is " +grade);

        }
    }
}
