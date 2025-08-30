import java.util.Scanner;
public class L7b_LoopingStatements{
    public static void main(String[] args){
        //2.Looping Statements
        //a. For Loop
        System.out.println("Using For Loop:");
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("For Loop Questions:");
        System.out.println("i. Multiplication table of 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num = sc.nextInt();
        for(int i = 1;i <= 10;i++){
            System.out.println(num+"*"+i+"="+ num*i);
        }
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        String result = ((Object) number).getClass().getSimpleName());
        if(number % 2 == 0){
            System.out.println(number +" is"+" Even");
        }else if(number % 2 != 0){
            System.out.println(number +" is"+" Odd");
        }
        //practice problems
        System.out.println("--------------------------------------------------");
        //b. While loop
        System.out.println("Using While Loop:");
        int i = 0;
        while (i<10){
            System.out.print(i+" ");
            i++;
        }
    }
}