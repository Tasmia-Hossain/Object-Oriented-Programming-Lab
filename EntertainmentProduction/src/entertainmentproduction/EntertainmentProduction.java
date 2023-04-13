
package entertainmentproduction;

public class EntertainmentProduction {

    public static void main(String[] args) {
        TVSeries t=new TVSeries("Bigg Boss");
        WebSeries w=new WebSeries("All of Us Are Dead","Hasib Source");
        
        t.productionInfo();
        w.productionInfo();
        
        t.stopProduction();
        w.stopProduction();
    }
    
}
