import java.util.Scanner;

public class CuboidVolume{

    static double length, width, height;

    // Static method
    static double calcVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextDouble();

        System.out.print("Enter Width: ");
        width = sc.nextDouble();

        System.out.print("Enter Height: ");
        height = sc.nextDouble();

        // Calculating and displaying the volume
        System.out.println("The volume of the cuboid is: " + calcVolume());

    
    }
}