import java.util.Arrays;//package
public class L4_Datatypes2 {
    public static void main(String[] args) {
        //2. Non-primitive DataTypes
        //a. Sring: Sequence of characters
        String collegeName = "Kashi";
        System.out.println("a. "+collegeName);

        //b. Array: Collection of elements with same datatype
        int [] arrayOfNumbers = {3,4,5,3,3,2};
        System.out.println(Arrays.toString(arrayOfNumbers));
        for(int i=0; i<arrayOfNumbers.length;i++){
            System.out.println(arrayOfNumbers[i]);
        }

        //c. Class: a blueprint or template that defines the structure and behavior of an object
        //          (an object is an instance of a class)
        //d. Enum: Constants values in object(eg: dropdown in gender field(Male and Female))
    }
}
