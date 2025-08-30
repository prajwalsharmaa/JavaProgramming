public class DeadLockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(resource1) {
                System.out.println("Thread 1 is using Resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(resource2) {
                    System.out.println("Thread 1 is using Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(resource2) {
                System.out.println("Thread 2 is using Resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(resource1) {
                    System.out.println("Thread 2 is using Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
