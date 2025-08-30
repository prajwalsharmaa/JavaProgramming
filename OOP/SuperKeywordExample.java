class Parent{
    int number = 100;
    Parent(){
        System.out.println("Parent Class Constructor Called!");
    }
    void otherMethod(){
        System.out.println("Parent Other Method Called!");
    }
    void secondMethod(){
        System.out.println("Parent second method is called");
    }
}
class Child extends Parent {
    int number = 200;
    void display(){
        super.otherMethod();
        System.out.println("Parent Class Number:" + super.number);
        System.out.println("Child Class Number:" +this.number);
    }
}
public class SuperKeywordExample{
    public static void main (String[] args){
        Child newChild = new Child();
        newChild.display();
    }
}