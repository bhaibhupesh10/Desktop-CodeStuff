package RandomQuestionSolving;

public class Car {
        // Instance variables
        private String brand;
        private String model;
        private int year;

        // Constructor
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Instance method
        public void startEngine() {
            System.out.println("The " + brand + " " + model + " engine is starting...");
        }

        // Getters and setters
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

