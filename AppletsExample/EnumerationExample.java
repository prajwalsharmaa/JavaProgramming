import java.util.Enumeration;
import java.util.Vector;
public class EnumerationExample {
    
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        Enumeration<String> enumeration = vector.elements();
        System.out.println("Fruits List: ");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}