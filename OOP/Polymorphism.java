public class Polymorphism{
    public static void main(String[] args)
    {
        //Polymorphism : Having multiple forms
        //Example 1:
        // int add(int a,int b)
        //Example 2:
        // int add(int a ,int b ,int c)
        //Example 3:
        // double add(double a, double b,double c) 
        // Method overloading caused do to multiple methods of same functioning(adding)
        // So the Objective is to create a method that adds for every type of arguments
        
        //Program Example
        
        System.out.println(add(3,3,3));
        System.out.println(add(3,3));
        Polymorphism example1 = new Polymorphism();
        System.out.println(example1.add(3f,3f));
        System.out.println("Area of rectangle is "+rectangle(9,8));
        System.out.println("Perimeter of rectangle is "+rectangle(9f,8f));
    }
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {// Method overloaded with 3 int parameters
        return a+b+c;
    }
    double add(double a, double b)
    {// Method overloaded with double type parameters
        return a+b;
    }
    static int rectangle(int a,int b)
    {
        return a*b;
    }
    static float rectangle(float a,float b)
    {
        return 2*(a+b);
    }
}