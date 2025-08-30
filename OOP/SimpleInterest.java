import java.util.Scanner;

public class SimpleInterest{

    // Static method
    static double cal_SI(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        double principle = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calling the static method
        double simpleInterest = cal_SI(principle, rate, time);
        
        System.out.println("The Simple Interest is: " + simpleInterest);

        sc.close();
    }
}