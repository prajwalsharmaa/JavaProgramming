public class L13_OOP3{
    String employeeName;
    static String employeeCEO;
    double employeeSalary;
    void displayDetails(){
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee CEO: "+employeeCEO);
        System.out.println("Employee Salary: "+employeeSalary);
    }
    public static void main(String[] args){
        L13_OOP3 object1 = new L13_OOP3();
        L13_OOP3 object2 = new L13_OOP3();
        L13_OOP3.employeeCEO = "Prajwal";
        object1.employeeName = "Ramesh";
        object1.employeeSalary = 34000;
        object2.employeeName = "Raama";
        object2.employeeSalary = 4000;
        object1.displayDetails();
        System.out.println("--------------------------------------------------");
        object2.displayDetails();
    }
}