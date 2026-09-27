import java.util.ArrayList;
import java.util.List;

public class generic6 {
    public static void main(String[] args){
        // Animal animal = new Dog();
        // animal.eat();
        // animal.walk();
        // animal.bark();it will throw error

        List<Dog> dogs = new ArrayList<>();
    } 
}

class Animal{

    void eat(){
        System.out.println("eating");
    }

    void walk(){
        System.out.println("walking");
    }
    
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
