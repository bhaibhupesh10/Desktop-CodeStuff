package RandomQuestionSolving.exercise;

public class Main{
    public static void main(String [] args){
        //  creating an object of the Car class
        Car myCar = new Car("TaTa", "SAFARI " ,2002);

        // accessing object properties and calling method
        System.out.println("Brand: " +  myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        //
        myCar.startEngine();
    }   
}