// Store elements in KEY-value pairs
// Key must be unique
// Values can duplicated
import java.util.Map;
import java.util.HashMap;
public class MapInterfaceExample{
    public static void main(String[] args){
        Map<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1,"Apple");
        mapExample.put(2,"Banana"); 
        mapExample.put(3,"Litchi");
        mapExample.put(4,"Litchi");

        System.out.println(mapExample);
    }
}