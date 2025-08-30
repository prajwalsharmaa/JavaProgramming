class MyThreadRunnable implements Runnable{
    public void run (){
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread : " + i);
        }
    }
}

public class ThreadRunnaleEg {
   public static void main(String[] args) {
       Runnable runnable = new MyThreadRunnable();
       Thread t1 = new Thread(runnable);
       t1.start();
   } 
}