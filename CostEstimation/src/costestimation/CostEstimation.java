
package costestimation;

public class CostEstimation {

    public static void main(String[] args) {
        
        Book obj1=new Book(2,10000);
        TotalPricing price1=new TotalPricing(obj1);
        price1.finalCost();
    }
    
}
