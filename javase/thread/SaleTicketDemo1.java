package javase.thread;

class Window extends Thread {
    static int ticket = 100;

    public void run() {

        while (ticket > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Window.class) {

                    System.out.println(getName() + "卖出一张票，票号:" + ticket);
                    ticket--;

            }
        }
    }
}

public class SaleTicketDemo1 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
