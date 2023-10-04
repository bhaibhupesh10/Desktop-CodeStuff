package EntranceRitisha;

public class SwappingWithoutThirdVar {
        public static void main(String[] args) {
            int a = 190;
            int b = 20;
            System.out.println("Before Swapping: a = " + a + " and b = " + b);

            // Swapping without using a third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping: a = " + a + " and b = " + b);
        }
    }

