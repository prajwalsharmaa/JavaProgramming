import java.util.Scanner;
public class L8_UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc_second = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("The entered number is :"+ a);
        System.out.println("Enter a number");
        double d = sc.nextDouble();
        System.out.println("The entered double number is :"+ d);
        System.out.println("Enter a number");
        float b = sc.nextFloat();
        System.out.println("The entered Float number is: "+ b);
        System.out.println("Enter a name");
        String name = sc_second.next();
        System.out.println("Name = "+ name);
        System.out.println("Enter full name");
        String fullName = sc.nextLine();
        System.out.println("FullName = "+ fullName);
        System.out.println("Enter a character");
        char chr = sc.next().charAt(0);
        System.out.println(chr);
        sc.close();
        sc_second.close();
    }
}