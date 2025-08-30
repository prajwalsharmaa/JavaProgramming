class Person{
    String name;
    final int salary = 10000;
}
class Child extends Person{
    void printDetails(){
        System.out.println(name);
        System.out.println(salary);
    }
}
public class FinalClass{
    public static void main(String[] args){
        //Final Class:
        //Constant class whose data cannot be modified
        //Final Keyword:
        //It is a constant keyword
        // String name = "Prajwal";
        // System.out.println(name);
        // name = "Sharma";
        // System.out.println(name);
        // final String newName = "Charlie";
        // // newName = "Prajwal"// Doesnot work due to final declration
        // System.out.println(newName);

        Child employee1 = new Child();
        employee1.name = "Prajwal";
        // employee1.salary = 300;//Doesnot Work due to final keyword
        employee1.printDetails();
    }
}