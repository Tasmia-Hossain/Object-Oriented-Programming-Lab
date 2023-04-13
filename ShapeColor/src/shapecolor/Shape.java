
package shapecolor;

public class Shape {
    private String color;
    private Boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    
    public Shape(){
        color="white";
        filled=true;
    }
    
    public Shape(String color,Boolean filled){
        this.color=color;
        this.filled=filled;
    }
    
    public double calculateArea(){
        return 1.0;
    }
}
