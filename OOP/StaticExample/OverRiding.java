class Animal{
    void makeSound(){
        System.out.println("Animal Sound!");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bhow Bhow");
    }
}
public class OverRiding{
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        animal1.makeSound();
        dog1.makeSound();
    }
}