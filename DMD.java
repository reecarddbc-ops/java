class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal obj = new Dog();   // Parent reference, child object
        obj.sound();              // Calls Dog's sound() method
    }
}
