
package shapedemo;

public class Circle {
    private double radius;
    private String color;
    
    boolean testObject(Circle circleObj){
        return (radius==circleObj.radius && color==circleObj.color);
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        if(radius==0){
            this.radius=1;
        }
        else if(radius>0){
            this.radius=radius;
        }
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public Circle(){
        
    }
    
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
}
