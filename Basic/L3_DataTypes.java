public class L3_DataTypes{
    public static void main(String[] args){
        //Variables -> A container where values are stored
        //Datatypes -> The type of data that variables can hold.
        //Java is Statically-Typed Language ie every variable must have specific datatype before use.


        //Types of Datatypes
        //1.Primitive Datatypes: It specifies the type and kind of value it can hold. The different types of primitive datatypes
        //are given as below:
        //a.byte : (Size:1 byte), (Range: -127 to 128)
        byte byteExample = 120;
        System.out.println("a. "+byteExample);

        //b.short : (Size: 2 bytes), (Range: -32768 to 32767)
        short shortExample = 334;
        System.out.println("b. "+shortExample);

        //c.int : (Size: 4 bytes), (Range: -2^31 to 2^31-1)
        int intExample = 3498;
        System.out.println("c. "+intExample);

        //Case-Sensitive (A != a)
        //d .long : (Size: 8 bytes), (Range: more than int)
        long longExample = 298347298L;
        System.out.println("d. "+longExample);

        //e .float : (Stores values for decimal points. Sufficient for storing 6 to 7 decimal)
        float floatExample = 12.34343f;
        System.out.println("e. "+floatExample);

        //f .double : (Stores values for decimal points. Sufficient for storing 15 to 16 decimal)
        double doubleExample = 12.3434298347293d;
        System.out.println("f. "+doubleExample);

        //g .boolean : (Stores values either true of false)
        boolean booleanExample = true;
        System.out.println("g. "+booleanExample);

        //h .char : (Stores a single character of ASCII values)
        char charExample ='A';
        System.out.println("h. "+charExample);
        char char2Example = 97;//a
        System.out.println("h. "+char2Example);
    }
}