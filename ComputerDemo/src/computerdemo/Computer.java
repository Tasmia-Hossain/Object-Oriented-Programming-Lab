
package computerdemo;

public abstract class Computer {
    
    public String name;
    public double processorSpeed;
    public int ramSize;
    public double hddCapacity;
    
    public Computer(){
        
    }
    
    
    public Computer(String name, double processorSpeed, int ramSize, double hddCapacity) {
        this.name = name;
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
        this.hddCapacity = hddCapacity;
    }
    
    public void compareProcessorSpeed(Computer c){
        if(processorSpeed>c.processorSpeed){
            System.out.println(name+" is faster than "+c.name);
        }
        else
            System.out.println(c.name+" is faster than "+name);
    }
    
    public abstract void installComponent(String name,String comp);
    public abstract void networkConnection(String net);
     
}
