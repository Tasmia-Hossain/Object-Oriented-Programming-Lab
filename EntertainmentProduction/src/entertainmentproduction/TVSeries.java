
package entertainmentproduction;

public class TVSeries extends ProductionCompany {
    
    private String tvSeriesName;
    
    public TVSeries(){
        
    }

    public TVSeries(String tvSeriesName) {
        this.tvSeriesName = tvSeriesName;
    }

    public TVSeries(String tvSeriesName, String companyName) {
        super(companyName);
        this.tvSeriesName = tvSeriesName;
    }
    
    @Override
    public void productionInfo(){
        System.out.println("TV Series Name is: "+this.tvSeriesName+"\n");
    }
}
