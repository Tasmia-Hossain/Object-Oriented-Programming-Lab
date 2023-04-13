
package areaandperimeter;

public class Rectangle {
    private float length,width;
    
    public float getLength(){
        return length;
    }
    
    public void setLength(float length){
        if(length>0.0f){
            this.length=length;
        }
        else{
            this.length=0;
        }
    }
    public float getWidth(){
        return width;
    }
    
    public void setWidth(float width){
        if(width>0.0f){
            this.width=width;
        }
        else{
            this.width=0;
        }
    }
    
    public Rectangle(){
    }
    
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    
    public double getArea(){
        return length*width;
    }
    
    public double getPerimeter(){
        return 2*(length+width);
    }
    
}
