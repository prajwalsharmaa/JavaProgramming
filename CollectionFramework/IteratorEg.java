import java.util.*;

public class IteratorEg {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
