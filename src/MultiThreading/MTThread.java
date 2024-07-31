package MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running.");
    }
}

public class MTThread {
    public static void main(String[] args) throws InterruptedException {

        MyThread threadT = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread threadR = new Thread(runnable);

        threadT.start();
        threadR.start();

    }
}