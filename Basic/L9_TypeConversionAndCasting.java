public class L9_TypeConversionAndCasting{
    public static void main(String[] args){
        // Type Conversion (Widening)(Implicit Conversion)
        int integerNumber = 34;
        float floatNumber = integerNumber;
        System.out.println(floatNumber);
        // Type Casting (Explicitly Coversion)
        float secondFloatNumber = 39.3f;
        int secondIntegerNumber = (int) secondFloatNumber;
        System.out.println(secondIntegerNumber);
        System.out.println(secondFloatNumber);        
    }
}