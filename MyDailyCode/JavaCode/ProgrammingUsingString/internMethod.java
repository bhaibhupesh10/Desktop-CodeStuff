package ProgrammingUsingString;

public class internMethod{
    public static void main(String[] args) {
        // this method is used to bring the string from non constant pool to constant pool;
        String s1 = new String("Bhupesh");
        String s2 = s1.intern();
        String s3 = "Bhupesh";
        if(s2==s3){
            System.out.println("References are equal");
        }
        else{
            System.out.println("References are not equal");
        }
    }
}
