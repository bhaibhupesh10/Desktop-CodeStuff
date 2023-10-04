package RandomQuestionSolving;

public class Main {

        public static void main(String[] args) {
            // Creating an object of the Car class
            Car myCar = new Car("Toyota", "Corolla", 2022);

            // Accessing object properties and calling methods
            System.out.println("Brand: " + myCar.getBrand());
            System.out.println("Model: " + myCar.getModel());
            System.out.println("Year: " + myCar.getYear());

            myCar.startEngine();
        }
    }
