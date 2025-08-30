public class OverLoading{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(3,4));
        System.out.println(add(3.34f,4.66f));
        System.out.println(add(3,4,4));
    }
}
    
