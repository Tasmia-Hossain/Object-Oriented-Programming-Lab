
package costestimation;

public class TotalPricing {
    public Book bookObj;
    public TotalPricing(Book bookObj){
        this.bookObj=bookObj;
    }
    
    public void finalCost(){
        int x=bookObj.getCostPerPage()*bookObj.getNumberOfPages();
        System.out.println("The Total Coxt: "+x);
        int digit=0;
        int y=x*x;
        while(x!=0){
            x=x/10;
            digit++;
        }
        if(y==digit){
            System.out.println("Pricing is too high");
        }
        else
            System.out.println("Pricing is okay");
    }
}
