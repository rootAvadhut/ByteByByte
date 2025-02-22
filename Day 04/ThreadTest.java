public class ThreadTest {
    public static void main(String[] args) {
        // Creating instances
        StringBuffer sbuf = new StringBuffer();
        StringBuilder sbuild = new StringBuilder();

        // Task for modifying StringBuffer (Thread-Safe)
        Runnable task1 = () -> { for (int i = 0; i < 1000; i++) sbuf.append("A"); };
        
        // Task for modifying StringBuilder (Not Thread-Safe)
        Runnable task2 = () -> { for (int i = 0; i < 1000; i++) sbuild.append("B"); };

        // Creating threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting threads
        thread1.start();
        thread2.start();

        // Waiting for threads to complete execution
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying results
        System.out.println("StringBuffer length: " + sbuf.length()); // Always 1000
        System.out.println("StringBuilder length: " + sbuild.length()); // May be inconsistent
    }
}