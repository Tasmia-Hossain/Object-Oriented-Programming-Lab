
package shapetest;

import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {
        ProduceShape3D obj=new ProduceShape3D();
        
        //System.out.println("Input 1 value: ");
        //double createShape3D=sc1.nextDouble();
        Shape3D shape1=obj.createShape3D(3);
        Shape3D shape2=obj.createShape3D(4,2);
        Shape3D shape3=obj.createShape3D(6,7 ,8 );
        
        System.out.println(shape1.getShapeName()+" Area: "+shape1.getSurfaceArea());
        System.out.println(shape2.getShapeName()+" Area: "+shape2.getSurfaceArea());
        System.out.println(shape3.getShapeName()+" Area: "+shape3.getSurfaceArea());
        
    }
    
}
