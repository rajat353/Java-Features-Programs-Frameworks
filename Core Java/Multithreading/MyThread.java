//By extending the Thread class

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Works "+ Thread.currentThread().getName());
    }
}