package RandomQuestionSolving;

import java.util.Scanner;

public class print2SqareSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power = 0;
        for(int i = 1;i<=10;i++){
             power = i * i;
            System.out.print(power + " ");

        }
    }
}
