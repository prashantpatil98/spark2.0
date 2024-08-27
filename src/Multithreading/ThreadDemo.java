package Multithreading;

class ThreadTest extends Thread
{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Child Thread.....");
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
         ThreadTest t1 = new ThreadTest();
         t1.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread.....");
        }

    }
}
