interface Parent1 {
    void show();
}
interface Parent2 {
    void show();
}
class Child implements Parent1,Parent2{// It doesnot work if interface is not used
    public void show(){
        System.out.println("Child Sound");
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        //Interface: 
        //1.Interface is a blueprint of class
        //2.It consists of abstract methods and keywords such as public, static, final
        //3.Interface is used to achieve multiple inheritance.
        Child child = new Child();
        child.show();
    }
}