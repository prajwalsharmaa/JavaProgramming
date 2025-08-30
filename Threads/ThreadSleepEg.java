public class ThreadSleepEg{
    public static void main(String[] args){
        Thread firstThread = new Thread ( () ->{
            try{
                for(int i = 1;i <= 3; i++){
                    System.out.println("First Thread - Count:" + i);
                    Thread.sleep(1000);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread secondThread = new Thread ( () ->{
            try{
                for(int i = 1;i <= 3; i++){
                    System.out.println("Second Thread - Count:" + i);
                    Thread.sleep(5000);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        });
        firstThread.start();
        secondThread.start();   
        //4 - Core cpu (Concurrently runs 8 threads)1 core -> 2 threads
        //8 - Core cpu (Concurrently runs 16 threads)
    }
}