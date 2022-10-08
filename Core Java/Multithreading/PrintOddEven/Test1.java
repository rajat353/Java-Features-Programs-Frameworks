
public class Test1 {

    public static void main(String[] args) {
        
        printNum t1=new printNum(1);
        printNum t2=new printNum(0);

        Thread odd=new Thread(t1, "odd");
        Thread even=new Thread(t2, "even");

        odd.start();
        even.start();
        
    }
}
