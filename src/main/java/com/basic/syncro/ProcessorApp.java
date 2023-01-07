package com.basic.syncro;

import java.util.Scanner;

public class ProcessorApp
{
    public static void main(String[] args)
    {
        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press enter to s" +
                "top");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        proc1.shutdown();
    }
}
