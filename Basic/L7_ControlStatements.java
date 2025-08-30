import java.util.Scanner;
public class L7_ControlStatements{
    public static void main(String[] args){
        //Control Statements: Coditional Statements, Looping Statements.
        //1. Conditional Statements: if,if-else, if-elseif-else, switch
        //a.If-Else Syntax:
        System.out.println("----------IF-Else Statements------------");
        int age = 30;
        if(age>18){
            System.out.println("1.a.Eligible");
        }
        else{
            System.out.println("1.a.Not Eligible");
        }
        String message = (age >=18) ? "Eligible" : "Not Eligible";
        System.out.println("1."+ message);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        }else if (a == 0){
            System.out.println("Zero");
        }else if(a < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Invalid Number");
        }
        //b. Switch Case
        int Day;
        switch (Day){
            case 1:System.out.prinln("Sunday");
            break;
            case 2:System.out.prinln("Monday");
            break;
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("Wednesday");
            break;
            case 5:System.out.println("Thursday");
            break;
            case 6:System.out.println("Friday");
            break;
            default:System.out.println("Saturday");
        }
        //2. Looping Statements: While, do-while, for
        //a. for loop :
        //Syntax :for()
    }
}