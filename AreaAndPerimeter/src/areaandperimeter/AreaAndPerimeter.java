
package areaandperimeter;

public class AreaAndPerimeter {
    
    public static void main(String[] args) {
        Rectangle myRectangle=new Rectangle(1.0f,1.0f);
        System.out.println("Rectangle Length: "+myRectangle.getLength()+",Width: "+myRectangle.getWidth());
        System.out.println("length="+myRectangle.getArea());
        System.out.println("length="+myRectangle.getPerimeter());
    }
    
}
