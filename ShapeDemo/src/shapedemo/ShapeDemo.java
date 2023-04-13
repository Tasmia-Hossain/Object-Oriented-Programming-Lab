
package shapedemo;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle myCircle1=new Circle(100,"red");
        Circle myCircle2=new Circle(10,"red");
        System.out.println("Are Values Equal: "+myCircle1.testObject(myCircle2));
        
        Circle myCircle=new Circle(12,"green");
        
        System.out.println("Color is: "+myCircle.getColor());
        System.out.println("Area is: "+myCircle.calculateArea());
        
        myCircle.setColor("blue");
        System.out.println("Changed Color is: "+myCircle.getColor());
        
        myCircle.setRadius(0);
        System.out.println("Area is: "+myCircle.calculateArea());
        
        myCircle.setRadius(15);
        System.out.println("Area is: "+myCircle.calculateArea());
    }
    
}
