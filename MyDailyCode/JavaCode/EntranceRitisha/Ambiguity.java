package EntranceRitisha;

class A {
    void display() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("This Class B");
    }
}

class C extends A {
    void display() {
        System.out.println("Class is C");
    }
}

class Ambiguity {
    public static void main(String[] args) {
        A a = new B(); // Object of type B is referred by a reference variable of type A
        a.display();

        a = new C(); // Object of type C is referred by a reference variable of type A
        a.display();
    }
}

