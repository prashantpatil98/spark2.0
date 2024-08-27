package Multithreading;

class SavingAccount
{
    public synchronized void withdraw(String name){
        for (int i =0; i < 5; i++)
        {
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name);
        }

        System.out.println("-------------Transaction Completed Successfully----------");
    }
}

class MyThreadAccount implements Runnable
{
    SavingAccount s;
    String name;

    MyThreadAccount (SavingAccount s, String name){
        this.s =s;
        this.name =name;
    }
    @Override
    public void run()
    {
        s.withdraw(name);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
//        MyThreadAccount t1 = new MyThreadAccount(savingAccount,"pati");
//        MyThreadAccount t2 = new MyThreadAccount(savingAccount, "biwi");

        Thread t1 = new Thread(new MyThreadAccount(savingAccount, "pati"));
        Thread t2 = new Thread(new MyThreadAccount(savingAccount, "biwi"));
        t2.start();

        t1.start();

    }
}
