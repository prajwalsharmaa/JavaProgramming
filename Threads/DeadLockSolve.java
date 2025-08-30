public class DeadLockSolve {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked Resource 1");

                    Thread.sleep(100);

                    synchronized (resource2) {
                        System.out.println("Thread 1 locked Resource 2");

                        // Do some work
                        Thread.sleep(100);

                        System.out.println("Thread 1 released Resource 2");
                    }

                    System.out.println("Thread 1 released Resource 1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                // 🔁 Lock in same order as Thread 1 to avoid deadlock
                synchronized (resource1) {
                    System.out.println("Thread 2 locked Resource 1");

                    Thread.sleep(100);

                    synchronized (resource2) {
                        System.out.println("Thread 2 locked Resource 2");

                        // Do some work
                        Thread.sleep(100);

                        System.out.println("Thread 2 released Resource 2");
                    }

                    System.out.println("Thread 2 released Resource 1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
