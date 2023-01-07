package com.threads;

public class Runner implements Runnable
{
    @Override
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Thread running "+ Thread.currentThread().getName()+" number:: "+ i);

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
