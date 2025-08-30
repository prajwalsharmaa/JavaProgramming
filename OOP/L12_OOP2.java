public class L12_OOP2{
    static int length;
    static int breadth;
    public void ParameterizedConstructor(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void displayDetails(){
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
    }
 
    public static void main(String[] args){
        ParameterizedConstructor cons1 = new ParameterizedConstructor(12,12);
        cons1.displayDetails();
        System.out.println("-------------------------------------------------");
        Person person1 = new Person("Prajwal Sharma",22,40000);
        person1.displayPersonDetails();
    }
}
class Person{
    static String name;
    static int age;
    static int salary;
    public Person(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void displayPersonDetails(){
        System.out.println("Name = " + name);
        System.out.println("Age = " +age);
        System.out.println("Salary = "+salary);
    }
}