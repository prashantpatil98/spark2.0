package Multithreading;

class YieldTest implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +":" + i);
            //Thread.yield();
            //System.out.println("Yield Thread");
        }
    }
}

class YieldTest1 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +":" + i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                throw new RuntimeException();
            }
            Thread.yield();
            //System.out.println("Yield Thread");
        }
    }
}

public class YieldDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new YieldTest(),"YieldTest");
        Thread t1 = new Thread(new YieldTest(),"YieldTest1");
        t.start();
        t1.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("main Thread");
//        }
    }

}
