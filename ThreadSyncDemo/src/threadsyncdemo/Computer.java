
package threadsyncdemo;

public class Computer implements Runnable{
    
    String name;
    Printer printer;
    
    public Computer(Printer printer,String name){
        this.printer=printer;
        this.name=name;
    }
    
    @Override
    public void run(){
        printer.print("Hello there",name);
    }
}
