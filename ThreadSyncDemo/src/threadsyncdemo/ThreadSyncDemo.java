
package threadsyncdemo;

public class ThreadSyncDemo {

    public static void main(String[] args) {
        
        Printer pr=new Printer();
        Thread t[]=new Thread[5];
        for(int i=0;i<5;i++){
            Computer com=new Computer(pr,"Computer: "+i);
            t[i]=new Thread(com);
            t[i].start();
        }
    }
    
}
