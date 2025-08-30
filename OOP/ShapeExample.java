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
public class ShapeExample{
    public static void main(String[] args){
        Cube cube = new Cube(4);
        System.out.println(cube.calculateVolume());
        Cuboid cuboid = new Cuboid(3,4,5);
        System.out.println(cuboid.calculateVolume());
    }
}