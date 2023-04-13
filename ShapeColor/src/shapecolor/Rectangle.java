
package shapecolor;

public class Rectangle extends Shape{
    public double length,width;
    
    public Rectangle(){
        length=1.0;
        width=1.0;
    }
    
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    
    Rectangle(String color,Boolean filled,double length,double width){
        super(color,filled);
        this.length=length;
        this.width=width;
    }
    
    @Override
    public double calculateArea(){
        return this.length*this.width;
    }
}
