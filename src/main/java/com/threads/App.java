package com.threads;

public class App
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        //t1.start();

        Thread1 t2 = new Thread1();
        //t2.start();

        Thread t3 = new Thread(new Runner());
        Thread t4 = new Thread(new Runner());

        t3.start();
        t4.start();
    }
}
