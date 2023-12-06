package ait.printer.task;

import ait.printer.Printer;

public class PrinterAppl {
    public static void main(String[] args) {
        Printer[] printer = new Printer[4];
        for (int i = 0; i < printer.length; i++) {
            printer[i] = new Printer(1);

        }
        Thread[] thread = new Thread[4];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(thread[i]);
        }
//        Thread[] thread = new Thread[(new Thread())];

        Thread.activeCount();


        for (int i = 0; i < thread.length; i++) {

                thread[i+1].start();


        }

    }
}


