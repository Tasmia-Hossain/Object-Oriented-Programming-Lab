
package boxdemo2;

public class Box {
    private double length,width,depth;
    public String material;
    
    public Box(){
        
    }
    
    public void setWidth(double w){
        if(w>0.0)
            width=w;
        else
            width=0;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double l){
        if(l>0.0)
            length=l;
        else
            length=0;
    }
    public double getLength(){
        return length;
    }
    public void setDepth(double d){
        if(d>0.0)
            depth=d;
        else
            depth=0;
    }
    public double getDepth(){
        return depth;
    }
    
    public void setvariable(double l,double w,double d,String m){
        length=l;
        width=w;
        depth=d;
        material=m;
    }
    public double calculateVolume(){
        return length*width*depth;
    }
    
}
