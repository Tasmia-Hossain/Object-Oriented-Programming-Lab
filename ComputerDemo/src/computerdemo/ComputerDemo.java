
package computerdemo;

public class ComputerDemo {

    public static void main(String[] args) {
        
        Desktop d=new Desktop();
        Laptop l=new Laptop();
        Tablet t=new Tablet();
        
        d.networkConnection("wifi");
        d.compareProcessorSpeed(l);
        d.installComponent("App", "Lap");
    }
    
}
