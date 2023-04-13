
package tvchannel;

public class SmartTv extends TV{
    
    public SmartTv(){
        
    }
    
    public SmartTv(double screenSize, double aspectRatio, double resolution) {
        super(screenSize, aspectRatio, resolution);
    }
    
    
    public void channelChange(int chNum){
        System.out.println("Showing Channel number  "+chNum);
    }
    
    public void runYoutube(){
        System.out.println("YouTube is running");
    }
}
