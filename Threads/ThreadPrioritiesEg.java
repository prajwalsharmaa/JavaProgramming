import java.lang.Thread;

class FirstThread extends Thread {
    public void run() {
        System.out.println(
            getName() + " (Priority: " + getPriority() + ") is running"
        );
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println(
            getName() + " (Priority: " + getPriority() + ") is running"
        );
    }
}

public class ThreadPrioritiesEg {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        //Set Thread Priority
        firstThread.setPriority(Thread.MIN_PRIORITY); // 1
        secondThread.setPriority(Thread.MAX_PRIORITY); // 10

        //Set Thread Names
        firstThread.setName("First Thread");
        secondThread.setName("Second Thread");

        // Start the threads
        firstThread.start();
        secondThread.start();

        try{
            //wait for thread to finish
            firstThread.join();
            secondThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All threads execution completed");
    }
}

