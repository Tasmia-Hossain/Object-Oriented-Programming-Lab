
package shapecolor;

public class Circle extends Shape {
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        super();
        radius=1.0;
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public Circle(String color,Boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
