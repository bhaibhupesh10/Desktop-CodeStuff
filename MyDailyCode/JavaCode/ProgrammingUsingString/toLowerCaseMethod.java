package ProgrammingUsingString;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class toLowerCaseMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string ");
        String s1 = scan.nextLine();
        System.out.println("enter second string");
        String s2 = scan.nextLine();
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.equals(s2));
        //equals ignore case
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("HU"));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.charAt(3));
        System.out.println(s1.substring(3,5));
        }
    }

