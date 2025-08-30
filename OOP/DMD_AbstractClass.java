//An abstract clas can have both abstract (without body) and concrete methods.
abstract class Animal{
    //abstract method
    abstract void makeSound();
    //Concrete Method
    void sleep(){
        System.out.println("Sleeping..");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bhow!");
    }
}
public class DMD_AbstractClass{
    public static void main(String[] args){
        Animal animal;
        animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
    }
}