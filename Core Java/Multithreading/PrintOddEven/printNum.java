
public class printNum implements Runnable {

    static int max_num = 10;

    public printNum(int remainder) {
        this.remainder = remainder;
    }

    static int num = 1;
    int remainder;

    static Object lock=new Object();

    @Override
    public void run() {
        while (num < max_num) {
            synchronized (lock) {
               while (num % 2 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
              System.out.println(Thread.currentThread().getName() + " " + num);
              num++;
              lock.notifyAll();
            }
        }
    }

}
