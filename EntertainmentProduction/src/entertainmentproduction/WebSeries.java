
package entertainmentproduction;

public class WebSeries extends ProductionCompany {
    
     private String seriesName;
     private String platformName;
     
     public WebSeries(){
       super(); 
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
    
    public WebSeries(String seriesName,String platformName) {
        this.seriesName=seriesName;
        this.platformName = platformName;
    }
    
    @Override
    public void productionInfo(){
        System.out.println("Web Series Name is: "+this.seriesName);
        System.out.println("Platform Name is: "+this.platformName+"\n");
    } 
}
