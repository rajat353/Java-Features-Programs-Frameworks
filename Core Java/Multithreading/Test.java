public class Test {
    public static void main(String[] args) {
        MyThread ob1= new MyThread();
        MyThread1 ob2= new MyThread1();

        Thread t1=new Thread(ob1);
        t1.setName("t1");
        
        Thread t2=new Thread(ob2);
        t2.setName("t2");

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName()); //main
    }
}
