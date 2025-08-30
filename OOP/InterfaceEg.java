interface Parent{
    void makeSound();
}
class Child implements Parent {
    public void makeSound() {
        System.out.println("Sound of child class");
    }
}
public class InterfaceEg{
    public static void main(String[] args){
        Child child = new Child();
        child.makeSound();
    }
}