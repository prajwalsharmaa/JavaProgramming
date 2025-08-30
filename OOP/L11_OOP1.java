public class L11_OOP1{ 
    public static void main(String[] args){
        //Class (Blueprint of an object)
        //Object (Instance of a class)
        //Features of OOP:
        //a. Abstraction
        //b.Polymorphism
        //c.Inheritance
        //d.Encapsulation
        //e.Classes and objects
        //f.Modularity
        

        //Creating Object Of Car Class
        System.out.println("--------------Car1---------------");
        Car car1 = new Car();
        //Assigning value to attributes
        car1.brand = "Porche";
        car1.speed = 300;
        car1.displayCarDetails();
        System.out.println("--------------Car2---------------");
        Car car2 = new Car();
        car2.brand = "Hyundai";
        car2.speed = 100;
        car2.displayCarDetails();
        System.out.println("--------------Bike1--------------");
        Bike bike1 = new Bike("Ducati",400);
        bike1.displayBikeDetails();
        ConstructorExample ConstructorExample1 = new ConstructorExample();// Automatically called when an object is created
    }
    static void ConstructorExample(){
        System.out.println("Constructor Example is called");
    }
}
class Car{
    //Fields or Data members or attributes
    String brand;
    int speed;
    //Method
    void displayCarDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed+"km/hr");
    }
}
class Bike{
    String brand;
    int speed;
    // Constructor
    public Bike(String brandName,int bikeSpeed){
        this.brand = brandName;
        this.speed = bikeSpeed;
    }
    public void displayBikeDetails(){
        System.out.println("Brand:"+brand);
        System.out.println("Speed: "+speed+"km/hr");
    }
    
}