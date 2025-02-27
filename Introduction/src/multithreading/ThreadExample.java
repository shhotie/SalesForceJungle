package multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        // stage1 = new
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // stage2 = Runnable
//        t1.start();
//        t2.start();

       // Step1 = Creating runnable instance
        MyRunnable myRunnable = new MyRunnable();

        // Step2 = Creating thread obj using runnable instance
        // Stage = new
        Thread t3 = new Thread(myRunnable);
        Thread t4 = new Thread(myRunnable);

        //stage2 = runnable
        t3.start();
        t4.start();

    }
}
