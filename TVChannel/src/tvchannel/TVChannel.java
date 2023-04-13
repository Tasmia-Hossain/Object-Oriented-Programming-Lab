
package tvchannel;

public class TVChannel {

    public static void main(String[] args) {
        
        TV t=new TV(15.6,1600,480);
        SmartTv s=new SmartTv(15.6,1600,480);
        
        t.channelChange(12);
        s.channelChange(52);
        t.increaseBrightness();
        s.increaseBrightness();
        s.runYoutube();
    }
    
}
