
package office;

public class Staff {
    public String officeName;
    private String firstName,lastName;
    private double monthlySalary;
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary=monthlySalary;
    }
    
    public Staff(){
        
    }
    
    public Staff(String officeName){
        this.officeName=officeName;
    }
    
    public Staff(String firstName,String lastName,double monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
    }
    
    public double AnnualSalary(){
        return 12*monthlySalary;
    }
}
