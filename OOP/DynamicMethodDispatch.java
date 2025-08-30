class Animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat Meows!");
    }
}
public class DynamicMethodDispatch{
    public static void main(String[] args){
        //Dynamic Method Dispatch
        //- It is also known as RunTime Polymorphism
        //Advantages:
        //Loose coupling can be achieved.
        //It can be achieved in:
        //a. Abstract classes
        //b. Interfaces
        // Dog dog1 = new Dog();
        // Cat cat1 = new Cat();
        // dog1.makeSound();
        // cat1.makeSound();
        Animal animal;
        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
        
    }
}