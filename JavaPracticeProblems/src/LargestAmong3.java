public class LargestAmong3{
    public static void main(String[] args){
        int a = 3;
        int b =34;
        int c = 23;
        int greatest = (a>b)?(a>c? a:c):(b>c? b:c);
        System.out.println("Greatest = "+greatest);
    }
}