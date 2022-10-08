//By implementing runnable interface

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Also works " + Thread.currentThread().getName());
    }
}
