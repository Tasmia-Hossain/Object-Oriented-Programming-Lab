
package circleareademo;

public class Circle {
    
    private double radius;
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(){
        this.radius = radius;
    }
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
    public String largeCircle(Circle c){
        if(this.radius>c.radius)
            return "First circle is larger";
        else
            return "Second circle is larger";
    }
}
