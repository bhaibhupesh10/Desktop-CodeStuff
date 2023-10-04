package RandomQuestionSolving;

import java.util.Scanner;
import java.io.*;
public class printSquareSeries {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i =0;i<t;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            printSeries(a, b, c);
        }
        scan.close();
}
    public static void printSeries(int a, int b, int c){
        int result = 0;
        for(int i=0;i<c;i++){
            // calculate the current term
             result += Math.pow(2,i)*b;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
