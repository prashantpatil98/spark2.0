package Multithreading;

class PriorityTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
            //System.out.println("child Thread");
        }
    }
}
public class PriorityDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new PriorityTest(), "Thread-1");
        Thread t2 = new Thread(new PriorityTest(), "Thread-2");
        System.out.println("t1 ki priority =" +t1.getPriority());
        System.out.println("t2 ki priority =" +t2.getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t1 ki priority =" + t1.getPriority());

        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t2 ki priority =" + t2.getPriority());

        t2.start();
        t2.join();
        t1.start();

        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread());
           // System.out.println("main Thread");
        }
    }
}

