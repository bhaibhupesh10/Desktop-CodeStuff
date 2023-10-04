package com.kodnest.learning.com.kodnest;
import java.util.Scanner;
public class reverseString{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a String");
        String str = scan.nextLine();
        System.out.println("your entered string is : " + str);

        char arr1[] = str.toCharArray();
        char arr2[] = new char[arr1.length];
        int j = arr2.length-1;
        for(int i=0;i<=arr1.length-1;i++){
            arr2[j] = arr1[i];
            j--;
        }
        str = new String(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(str);
    }
}