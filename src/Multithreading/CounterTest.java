package Multithreading;

class Counter{

    int count = 0;
    public synchronized void incre()
    {
        count ++;
    }


}

public class CounterTest {
}
