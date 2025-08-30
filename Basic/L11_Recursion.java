public class L11_Recursion{
    // Recursive method to calculate factorial
    static int factorial(int n){
        if(n == 0){
            return 1;// Base Case
        }
        return n * factorial(n-1);// Recursive Case
    }
    static int fibonacci(int n){
        if (n <= 1) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int sumOfDigit(int n){
        if (n <= 1) {
            return n; // Base case
        }
        return n + sumOfDigit(n-1);
    }
    public static void main(String[] args){
        // Recursion : Calling Itself
        // Recursion consist of :
        //1. Recursive case: calling itself
        //2. Base case: stopping condition
        System.out.println(sumOfDigit(0));
        int n = 10;
        System.out.println("Fibonacci Series Upto " +n+" elements :");
        for (int i = 0; i <= n-1; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}