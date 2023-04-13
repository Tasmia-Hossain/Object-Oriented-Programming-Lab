
package createtulip;


public class Tulip {
    private String color;
    private double height;
    
    public void setColor(String color){
        this.color=color;
    }
    
    public void setHeight(double height){
        this.height=height;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public Tulip(){
        
    }
    
    public Tulip(String color,double height){
        this.color=color;
        this.height=height;
    }
    
   /* public Tulip mixTulip(Tulip anotherTulip){
        Tulip newTulip=new Tulip();
        newTulip.height=(this.height+anotherTulip.height)/2;
        if((this.color=="red" && anotherTulip.color=="white")||this.color=="white"&&anotherTulip.color=="red"){
            newTulip.color="pink";
        }
        else if(this.color=="red"&&anotherTulip.color=="red"){
            newTulip.color="red";
        }
        else if(this.color=="white"&&anotherTulip.color=="white"){
            newTulip.color="white";
        }
        return newTulip;
    }  */
    
    public Tulip mixTulip(Tulip tulip2,Tulip tulip3){
        Tulip newTulip=new Tulip();
        newTulip.height=(this.height+tulip2.height+tulip3.height)/3;
        newTulip.color=this.color+" "+tulip2.color+" "+tulip3.color;
        return newTulip;
    }
}
