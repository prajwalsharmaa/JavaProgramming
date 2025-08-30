// An ordered collection that allows to store duplicate elements.
// Elements can be accessed  by index
// Common Implementations
import java.util.ArrayList;
import java.util.List;
public class ListInterfaceExample{
    public static void main(String [] args){
        List<String> names = new ArrayList<>();
        names.add("CSIT");
        names.add("CSE");
        names.add("BCA");
        names.add("CSIT");//Duplicate Elements

        System.out.println(names);
        System.out.println(names.get(1));
    }
}