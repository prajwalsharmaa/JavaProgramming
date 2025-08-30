public class L6_Operators{
    public static void main(String[] args){
        //Operators: Operators are the symbols used to perform operations(+, -, <,>,!=,==)

        // Operands: Operands are the variables (a,b)

        //Types:
        //1. Arithmetic Operators: Performs Mathematical Operations (+,-,*,/)
        float a = 20f;
        float b = 30f;
        System.out.println("1.a.  "+(a+b));
        System.out.println("1.b.  "+(a/b));
        System.out.println("1.c.  "+(b-a));
        System.out.println("1.d.  "+(b*a));
        System.out.println("------------------------------------------------------");


        //2. Relational Operators: Compare between two or more than two operands (<,>,==<,<=,>=,!=)
        int c = 30;
        int d = 40;
        System.out.println("2.c < d .."+(c<d));
        System.out.println("2.c <= d .."+(c<=d));
        System.out.println("2.c > d .."+(c>d));
        System.out.println("2.c >= d .."+(c>=d));
        System.out.println("2.c == d .."+(c==d));
        System.out.println("2.c != d .."+(c!=d));

        System.out.println("------------------------------------------------------");

        //3. Logical Operator: Operation on boolean values (AND (&&),OR (||), NOT(!))

        boolean x = true;
        boolean y = false;
        System.out.println("3. AND.."+ (x && y));
        System.out.println("3. OR.."+ (x || y));
        System.out.println("3. NOT"+!x);
        System.out.println("------------------------------------------------------");


        //4. Assignment Operator: Assigns values to variable
        int f = 20;
        int g = 40;
        System.out.println("4. +=..."+(f+=2));
        System.out.println("4. -=..."+(f-=2));
        System.out.println("4. *=..."+(f*=2));
        System.out.println("4. /=..."+(f/=2));
        System.out.println("4. =..."+(f=g));
        System.out.println("------------------------------------------------------");

        //5. Ternary Operator: (condition) ? "if true" : "if false"
        int h = 10;
        int i = 30;
        boolean resultBool = (h < i) ? true : false;
        String resultString = (h < i) ? "H is less than I" : "H is greater than I";
        System.out.println("5.ternary.1."+resultBool);
        System.out.println("5.ternary.2.."+ resultString);
        System.out.println("----------------------------------------------------------------");

        //6. Bitwise Operator: Operation on bits (&, |, ^, ~)
        int j = 9;   //1001
        int k = 10;  //1010 *(AND)
                     //1000
        System.out.println("6.The Bitwise AND is: "+(j&k));
        System.out.println("6.The Bitwise OR is: "+(j|k));
        System.out.println("6.The Bitwise XOR is: "+(j^k));
        System.out.println("6.The Bitwise Compliment is: "+(~j));
        System.out.println("----------------------------------------------------------------");
        
        //7. Increment and Decrement Operator: Increases and Decreases value by 1
        //(Pre-Increment(++i) and Decrement(--i)),(Post-Increment(i++) and Decrement(i--))
        i = 4;
        System.out.println("7.Preincrement."+ (++i));//increments before using in an expression
        System.out.println("7.Reinitialized value of i = "+ (i));

        System.out.println("7.Postincrement."+ (i++));//increments after its use in an expression
        System.out.println("7.Reinitialized value of i = "+ (i));

        System.out.println("7.Predecrement."+ (--i));
        System.out.println("7.Reinitialized value of i = "+ (i));//decrements before using in an expression

        System.out.println("7.Postincrement."+ (i--));
        System.out.println("7.Reinitialized value of i = "+ (i));//decrements after its use in an expression
        System.out.println("----------------------------------------------------------------");


        //8. Shift Operator: Used to manipulate the bits.
        // Left Shift (<<): Shifts the bits to the left and fills 0 to the right
        int z = 5;
        h = 40;
        int leftShiftResult = z << 1;
        int leftShift2Result = z << 2;
        int rightShiftResult = h >> 1;
        int rightShift2Result = h >> 2;
        System.out.println("8.The left shift by 1: "+leftShiftResult);
        System.out.println("8.The left shift by 2: "+leftShift2Result);
        System.out.println("8.The right shift by 1: "+rightShiftResult);
        System.out.println("8.The right shift by 2: "+rightShift2Result);
    }
}