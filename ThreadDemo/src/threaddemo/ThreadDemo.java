
package threaddemo;

public class ThreadDemo {

    public static void main(String[] args) {
        
        Producer p1=new Producer();
        Thread t1=new Thread(p1);
        t1.setName("T1");
        t1.start();
        
        Producer p2=new Producer();
        Thread t2=new Thread(p2);
        t2.setName("T2");
        t2.start();
        
        try{
                t1.join(1000);
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
        
        Producer p3=new Producer();
        Thread t3=new Thread(p3);
        t3.setName("T3");
        t3.start();
        
        System.out.println("Main Thread");
    
    }
    
}
