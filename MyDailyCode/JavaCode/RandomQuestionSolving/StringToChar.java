package RandomQuestionSolving;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class StringToChar {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s1 = scan.nextLine();
        char s2[] = s1.toCharArray();
        for(int i = 0;i<=s2.length-1;i++)
        {
            System.out.println(s2[i]+" ");

        }
        }
    }

