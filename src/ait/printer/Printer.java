package ait.printer;

public class Printer implements Runnable{
    int number;
    Thread nextThread;
    static int portion = 4;
//    int clockPeriod = 10;

    public Printer(int number) {
        this.number = number;
    }

    public void setNextThread(Thread nextThread) {
        this.nextThread = nextThread;
    }

    @Override
    public void run() {
        System.out.println("printer started");
        for (int i = 0; i < portion; i++) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(portion);
                nextThread.run();
            }

        }
        System.out.println("all sleep");
    }
}
