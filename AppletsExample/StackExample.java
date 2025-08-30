import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Mango");
        stack.push("Banana");
        System.out.println("Stack : " + stack);


        // Pooping element 

        String top = stack.pop();
        System.out.println("Popped" + top);
        System.out.println("Stack after pop: " + stack);

}
}