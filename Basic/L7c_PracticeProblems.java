import java.util.Scanner;

public class L7c_PracticeProblems{
    public static void main (String [] args){
// for loop io calculate summ of n number
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
int sum =0;
for(int i=1; i<=input; i++){
 sum = sum + i;
}


System.out.println("-------------------------------------------");
// print all even number between 1 to 50 using while loop 
int num =1;
while( num<=50){
    if(num %2 == 0){
        System.out.print("1."+num + " ");
    }
    num++;
}

System.out.println("-------------------------------------------");
// print number from 100 to 1 in reverse using while loop
int num =100;
while (num>=1){
    System.out.print(num + " ");
    num--;
}
System.out.println("-------------------------------------------");

//print a factorial of n using for loop
System.out.println("Enter a num to calculate factorial:");
int input1  =sc.nextInt();
int num1=1 ;
for(int i =1;i<=input1;i++){
    num1 = num1*i;
}

System.out.print("Factorial :"+num1);

System.out.println("-------------------------------------------");
//  fibonacci using for loop
    int n = 10; // Number of terms
    int first = 0, second = 1;

    System.out.println("Fibonacci Series up to " + n + " terms:");
    for (int i = 0; i < n; i++) {
        System.out.print(first + " ");
        int next = first + second;
        first = second;
        second = next;
    System.out.println("-------------------------------------------");

//reverse of digits using while loop
int reversed =0;
System.out.println("Enter Number to Reverse:");
int revnum = sc.nextInt();
while(revnum> 0 ){
  int  digit =  revnum %10;
  reversed = reversed*10+digit;
  revnum = revnum/10;
}
System.out.print(reversed);
    }
}
