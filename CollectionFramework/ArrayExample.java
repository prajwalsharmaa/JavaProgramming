import java.util.Arrays;
public class ArrayExample{
    public static void main(String args[]){
        int [] numbers = new int [5];
        numbers [0] = 10;
        numbers [1] = 20;
        numbers [2] = 30;

        String [] name = {"Prajwal","Sushant","Siraj","Kishan"};
        System.out.println(Arrays.toString(name));

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}