
package tvchannel;

public class TV {
    
    private double screenSize;
    private double aspectRatio;
    private double resolution;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
    
    public TV(){
        
    }
    public TV(double screenSize, double aspectRatio, double resolution) {
        this.screenSize=screenSize;
        this.aspectRatio=aspectRatio;
        this.resolution=resolution;
    }
    
    public void channelChange(int chNum){
        System.out.println("Channel: "+chNum);
    }
    
    public void increaseBrightness(){
        System.out.println("Brightness is increasing");
    }
}
