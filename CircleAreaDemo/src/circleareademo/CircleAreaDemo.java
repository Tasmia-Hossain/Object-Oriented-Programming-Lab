
package circleareademo;

public class CircleAreaDemo {

    public static void main(String[] args) {
        
        Circle c1=new Circle(5.2);
        Circle c2=new Circle(3.5);
        
        System.out.println("Area of c1 circle: "+c1.calculateArea());
        System.out.println("Area of c2 circle: "+c2.calculateArea());
        System.out.println(c1.largeCircle(c2));
    }
    
}
