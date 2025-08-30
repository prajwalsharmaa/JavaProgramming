// Parent class
class Animal {
    protected String name;

    protected void display() {
        System.out.println("Animal name: " + name);
    }
}

// Child class
class Dog extends Animal {
    public void setName(String dogName) {
        name = dogName;  // Accessing protected member
    }

    public void show() {
        display();  // Accessing protected method
    }
}

// Main class
public class ProtectedAccessMod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.show();
    }
}
