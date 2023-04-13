
package boxdemo;

public class Box {
        public double height,width,depth;
        
        public void setHeight(double h){
            if(h>0.0){
                height=h;
            }else{
                height=0;
            }
        }
        public double getHeight(){
            return height;
        }
        public void setWidth(double w){
            if(w>0.0){
                width=w;
            }else{
                width=0;
            }
        }
        
        public double getWidth(){
            return width;
        }
        public void setDepth(double d){
            if(d>0.0){
                depth=d;
            }else{
                depth=0;
            }
        }
        
        public double getDepth(){
            return depth;
        }
        
        public Box(){
            
        }
        public Box(double h,double w,double d){
            height=h;
            width=d;
            depth=d;
        }
        double calculateVolume(){
            return height*width*depth;
        }
}
