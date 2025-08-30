class Shape{
    double length, breadth, height;

    Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double calculateVolume() {
        return length * breadth * height;
    }    
}
class Cube extends Shape{
    Cube(double length) {
        super(length, length, length);
    }
}
class Cuboid extends Shape{
    Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }
}
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    void stop(){
        System.out.println("Vehicle Stopped");
    }
}
public class L14_OOP_Inheritance{
    public static void main(String[] args){
        //Inheritance:
        //Extracting the property from parent class to child class i.e Super class and sub class
        //Functions:a.Polymorphism b.Code Reusability c.Method Overriding
        //Types of Inheritance
        //a.Single Inheritance
        //b.Multiple
        //c.Multilevel
        //d.Hybrid
        Vehicle vehicle = new Vehicle();
        vehicle.run();
       // vehicle.stop();//Doesnot Work if child is not extended
        Car car = new Car();
        car.stop();
        car.run();
        Cuboid cuboid1 = new Cuboid();
        System.out.println(cuboid1.cubeVolume(4,5,6));
    }
}