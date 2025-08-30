public class L5_Keywords{
    public static void main(String[] args){
        //1. Constants: constants are the keywords whose values cannog be reassigned;
        float valueOfPI= 3.14f;//we have to declare constant to deny reassigning
        final double VALUE_OF_PI = 3.14;
        System.out.println(valueOfPI);
        System.out.println(VALUE_OF_PI);
        //VALUE_OF_PI = 4(Cannot assign value)
        //System.out.println(VALUE_OF_PI);

        //2. Identifiers: 
        int age = 40;// age -> identifier
        String name = "Prajwal";// name -> identifier

        //3. Literals:
        int firstNumber = 40;// Integer Literal
        boolean isActive = true;// Boolean Literal
               
    }
}