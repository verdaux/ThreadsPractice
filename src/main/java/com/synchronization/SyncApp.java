package com.synchronization;

public class SyncApp
{
    private int count;
    public static void main(String[] args) throws InterruptedException
    {
        SyncApp syncApp = new SyncApp();
        syncApp.doWork();

    }

    public synchronized void increment()
    {
        count++;
    }
    public void doWork() throws InterruptedException
    {
        Thread t1 = new Thread(
                new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for (int i=0; i<10000 ; i++)
                        {
                            increment();
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for (int i=0; i<10000 ; i++)
                        {
                            increment();
                        }
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("count is "+count);
    }
}
