
package shapetest;

public class Shape3D {
    private String shapeName;
    private double surfaceArea;
    
    public void setShapeName(String shapeName){
        this.shapeName=shapeName;
    }
    
    public String getShapeName(){
        return this.shapeName;
    }
    
    public void setSurfaceArea(double surfaceArea){
        this.surfaceArea=surfaceArea;
    }
    
    public double getSurfaceArea(){
        return this.surfaceArea;
    }
    
    public Shape3D(){
        
    }
    
    public Shape3D(String shapeName,double surfaceArea){
        this.shapeName=shapeName;
        this.surfaceArea=surfaceArea;
    }
    
}
