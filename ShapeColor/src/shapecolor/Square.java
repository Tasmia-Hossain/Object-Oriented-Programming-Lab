
package shapecolor;

public class Square extends Rectangle {
    
    public Square(){
        
    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color,Boolean filled,double side){
        super(color,filled,side,side);
    }
    
    @Override
    public double calculateArea(){
        return this.length*this.width;
    }
}
