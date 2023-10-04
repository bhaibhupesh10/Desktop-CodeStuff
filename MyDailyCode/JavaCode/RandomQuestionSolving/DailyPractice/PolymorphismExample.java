package RandomQuestionSolving.DailyPractice;

public class PolymorphismExample {
    public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.makeSound();
    cat.makeSound();
    }
    }

    class Animal{

    void makeSound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal{
@Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
void makeSound(){
    System.out.println("Cat meows");
}
}