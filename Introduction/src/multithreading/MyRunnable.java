package multithreading;

public class MyRunnable implements Runnable{
    // Stage 3 = Running
    @Override
    public void run() {
        for(int i =1; i<= 5; i++){
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                //  Stage 5 = Timed Waiting State
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
