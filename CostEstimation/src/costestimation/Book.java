package costestimation;

public class Book {
    private int numberOfPages,costPerPage;
    public Book(int numberOfPages,int costPerPage){
        this.numberOfPages=numberOfPages;
        this.costPerPage=costPerPage;
    }
    
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    
    public void setCostPerPage(int costPerPage){
        this.costPerPage=costPerPage;
    }
    
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    
    public int getCostPerPage(){
        return this.costPerPage;
    }
    
}

