public class PracticeSet1{
    public static void main(String[] args){
        //1. Give an example of Logical Operator (||,&)
        boolean a = true;
        boolean b = false;
        System.out.println("1.AND Operator--"+(a&&b));
        System.out.println("1.OR Operator--"+(a||b));
        System.out.println("--------------------------------------------------------");
        //2. Give an example of Bitwise Operator(~)
        int c = 4;
        System.out.println("2.~ Operator--"+ (~c));
        System.out.println("--------------------------------------------------------");

        //3. Give example of Arithmetic Operator(+,%)
        int e = 3;
        int f = 4;
        System.out.println("3.+ Operator---"+(e+f));
        System.out.println("3.% Operator---"+(f%e));
        System.out.println("--------------------------------------------------------");

        //4. Give example of Ternary Operator (check for eligible to vote or not);
        int age = 16;
        String vote = age >= 18 ? ("Can Vote") : ("Cannot Vote");
        System.out.println("4. Ternary Operator--"+vote);
        System.out.println("--------------------------------------------------------");

        //5.Give example of Pre-increment and Post-decrement
        int i = 8;
        System.out.println("5.Pre-increment = "+(++i));
        System.out.println("5.Post-decrement"+(i--));
        System.out.println("--------------------------------------------------------");

        //6.Give example of Right shift by 3
        int j = 7;
        int rightShiftResult = (j >> 3);
        System.out.println("6.Right-Shift ="+rightShiftResult);
    }
}