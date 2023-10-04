package ProgrammingUsingString;

public class equalsIgnoreCase {
    public static void main(String[]args)
    {
        String s1 = "Bhupesh";
        String s2 = "BHUPESh";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
