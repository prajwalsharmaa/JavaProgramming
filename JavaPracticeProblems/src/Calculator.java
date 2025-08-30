import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float a = 30f;
        float b = 34f;
        System.out.println("Enter Operation To Perform");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+' : System.out.println("Addition = " + (a + b));
            break;
            case '-' : System.out.println("Subtraction" + (a - b));
            break;
            case '*' : System.out.println("Multiplication" + (a * b));
            break;
            case '/' : System.out.println("Division" + (a / b));
            default  : System.out.println("No Result");
        }
    }
}