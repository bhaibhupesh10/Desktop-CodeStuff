package Encapsulation;

public class EncapsulationApp {
    public static void main(String [] args){
        textBook tb = new textBook();
        tb.setPageno(100);
        System.out.println(tb.getPageno());
    }
}
