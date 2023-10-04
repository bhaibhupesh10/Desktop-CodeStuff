package ProgrammingUsingString;
import java.lang.String;

public class CompareToMethod {
    public static void main(String[]args){
        String s1 = "Bhupesh";
        String s2 = "Tarun";

        if(s1.compareTo(s2)>0){
            System.out.println("String s1 is greater ");}
            else if(s1.compareTo(s2)<0){
                System.out.println("String s2 is greater");}

                else{
                System.out.println("Strings are equal");
            }

        }
    }

