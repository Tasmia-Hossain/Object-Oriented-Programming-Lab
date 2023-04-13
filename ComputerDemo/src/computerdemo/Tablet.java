
package computerdemo;

public class Tablet extends Computer {
    
    private double screenSize;
    private String net;
    private String comp;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }
    
    public Tablet(){
        
    }
    public Tablet(double screenSize, String net, String comp, String name, double processorSpeed, int ramSize, double hddCapacity) {
        super(name, processorSpeed, ramSize, hddCapacity);
        this.screenSize = screenSize;
        this.net = net;
        this.comp = comp;
    }
    
    public void installComponent(String name,String comp){
        System.out.println("Intalling"+name+"to"+comp);
    }
    
    public void networkConnection(String net){
        System.out.println("Connected network to"+net);
    }
    
    public void touchScreen(double screenSize){
        System.out.println("Screen size is "+screenSize);
    }
}