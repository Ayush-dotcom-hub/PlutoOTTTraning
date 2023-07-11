public class DeadlockExample {

    //Dead Lock Exmaple
    private static final Object lock1 = new Object();
    private  static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 acquired lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {

                synchronized (lock2) {
                    System.out.println("Thread 2 acquires lock 2");

                synchronized (lock1) {
                    System.out.println("Thread 2 acquires lock 1");
                }
            }
        });

        thread1.start();
        thread2.start();

        /* Two Thread Thread1 and Thread2 and Thread 1 is trying to acquire lock1 and then lock2. While Thread2 acquires
        lock2 and then lock1. Both thread wait for each other to release the lock and they are accessing the lock in different order which leads to dead lock situation.*/


    }
}
