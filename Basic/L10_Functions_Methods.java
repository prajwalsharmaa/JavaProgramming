import java.util.Scanner;
public class L10_Functions_Methods{
    static int add(int a,int b){
       return a + b;
    }
    static int multiply(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition : "+add(2,3));
        System.out.println("Enter the numbers to multiply");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Multiplication : "+ multiply(a,b,c));
    }
}