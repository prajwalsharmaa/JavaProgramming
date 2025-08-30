public class Outer{
    static void sayHello(){
        System.out.println("Hello");
    }
    class Inner{
        static void diplayInnerClassDetails(){
            System.out.println("Data from the inner class");
        }
    }
    public static void main(String[] args){
       sayHello();
       Outer example1 = new Outer();
       Outer.Inner nonStaticObjectExample = example1.new Inner();
       nonStaticObjectExample.diplayInnerClassDetails();
    }
}