public class TryCatch{
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("After Exception Handling");
        
    }
}