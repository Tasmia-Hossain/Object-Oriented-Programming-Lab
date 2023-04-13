
package shapecolor;

public class ShapeColor {

    public static void main(String[] args) {
        
        Shape callObj=null;
        callArea(callObj,"rectangle");
       
        Shape obj1=new Circle(5.5);
        Shape obj2=new Rectangle(5.5,6.7);
        Rectangle obj3=new Square(5.5);
        Shape obj4=new Square(6.5);
        
        System.out.println(obj1.calculateArea());
        System.out.println(obj2.calculateArea());
        System.out.println(obj3.calculateArea());
        System.out.println(obj4.calculateArea());
        
        
        Shape obj=new Shape();
        Circle cirObj=new Circle("blue",true,10.8);
        Rectangle recObj=new Rectangle("ash",false,4.5,3.2);
        Square sqObj=new Square("brown",true,2.0);
        
        System.out.println("Area of Shape: "+obj.calculateArea());
        System.out.println("Area of Circle: "+cirObj.calculateArea());
        System.out.println("Area of Rectangle: "+recObj.calculateArea());
        System.out.println("Area of Square: "+sqObj.calculateArea()+"\n");
        
        System.out.println("Color of Shape: "+obj.getColor());
        System.out.println("Filled of Shape: "+obj.getFilled()+"\n");
        
        System.out.println("Color of Circle: "+cirObj.getColor());
        System.out.println("Filled of Circle: "+cirObj.getFilled());
        System.out.println("Radius of Circle: "+cirObj.getRadius()+"\n");
        
        System.out.println("Color of Rectangle: "+recObj.getColor());
        System.out.println("Filled of Rectangle: "+recObj.getFilled());
        System.out.println("Length of Rectangle: "+recObj.length);
        System.out.println("Width of Rectangle: "+recObj.width+"\n");
        
        System.out.println("Color of Square: "+sqObj.getColor());
        System.out.println("Filled of Square: "+sqObj.getFilled());
        System.out.println("Length of Square: "+sqObj.length);
        System.out.println("Width of Square: "+sqObj.width);
    }
    
    
    public static void callArea(Shape shapeObj,String type){
        if(type.equals("circle")){
            shapeObj=new Circle(3.5);
            System.out.println("DMD"+shapeObj.calculateArea());
        }
        else if(type.equals("rectangle")){
            shapeObj=new Rectangle(5,6);
            System.out.println("DMD"+shapeObj.calculateArea());
        }
        else if(type.equals("square")){
            shapeObj=new Square(6.7);
            System.out.println("DMD"+shapeObj.calculateArea());
        }
    }
    
}
