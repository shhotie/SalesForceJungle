package multithreading;

public class MyThread extends Thread{
    // Stage 3 = Running
    // Overriding run()
    public void run(){
        for(int i =1; i<= 5; i++){
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                //  Timed Waiting State
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
