
package shapetest;

public class ProduceShape3D {

    public Shape3D createShape3D(double side){
        Shape3D shape1=new Shape3D();
        shape1.setSurfaceArea(6*side*side);
        shape1.setShapeName("Cube");
        return shape1;
    }
    
    public Shape3D createShape3D(double radius,double height){
        Shape3D shape2=new Shape3D();
        shape2.setSurfaceArea(Math.PI*radius*radius*height);
        shape2.setShapeName("Cylinder");
        return shape2;
    }
    
    public Shape3D createShape3D(double x,double y,double z){
        Shape3D shape3=new Shape3D();
        shape3.setSurfaceArea(2*x*y+2*y*z+2*z*x);
        shape3.setShapeName("Cuboid");
        return shape3;
    }
}
