public class Program5_Solution {

    private static final Object lock1 = new Object();
    private static final Object lock2  = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquires lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 acquires lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {

                synchronized (lock1) {
                    System.out.println("Thread 2 acquires lock 1");


                    synchronized (lock2) {
                        System.out.println("Thread 2 acquires lock 2");

                    }
                }
        });

        thread1.start();
        thread2.start();

    }
}
