
package teatfinal;

public class GiftBox extends Box2 {
    private double length;
    private double width;
    private double height;
    
    final public String color="Yellow";
    
    GiftBox(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    
    public void printVolume(Box bobj){
        double volume=bobj.getVolume(this.length, this.width, this.height);
        System.out.println("Volume of the GiftBox: "+volume);
    }
}
