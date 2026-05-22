import java.util.*;
public class GenericsExample{
    public static void main(String [] args){
        // IntegerPrinter printer = new IntegerPrinter(234);
        // printer.print();

        // Printer<Integer> printer = new Printer(345);//We cannot use primitive data type like int. We have to use wrapper class like Integer to make this work
        // printer.print();

        // Printer<String> printer2 = new Printer("Prajwal Sharma");
        // printer2.print();

        ArrayList<String> list = new ArrayList<>();

        list.add("Cat");
        


        for(String s : list){
            System.out.println(s);
        }


        //ArrayList<Object> cats = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        // cats.add(new Dog()); creating the list that holds whatever type of object causes type safety issues so we have to use generics for type safety
        Cat myCat = (Cat)cats.get(0);//java doesnot know it is list of Cat it just knows its list of Object so we have to type cast
        Cat biralo = new Cat();
        
        Printer<Cat> printer = new Printer(biralo);
        printer.print();

        shout("Generic method");
        shout(69);
        shout(new Cat());
        shout("Prajwal", 67);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
   }

   private static <T> void shout (T thingToShout){
        System.out.println(thingToShout + "!!!!!!");
   }

    private static <T , K> void shout (T thingToShout ,K otherthingToShout){
        System.out.print(thingToShout + "!!!!!!");
        System.out.print(otherthingToShout + "!!!!!!");
   }

   // i want to printout the list that contains any kind of objects
    private static void printList(List<?> myList){
        System.out.println(myList);
    }

}