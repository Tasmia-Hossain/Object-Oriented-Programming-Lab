
package computerdemo;

public class Desktop extends Computer {
    
    private String comp;
    private String net;

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }
    public Desktop(){
        
    }
    
    public Desktop(String comp, String net, String name, double processorSpeed, int ramSize, double hddCapacity) {
        super(name, processorSpeed, ramSize, hddCapacity);
        this.comp = comp;
        this.net = net;
    }
    
    public void installComponent(String name,String comp){
        System.out.println("Intalling "+name+" to "+comp);
    }
    
    public void networkConnection(String net){
        System.out.println("Connected network to "+net);
    }

    
}
