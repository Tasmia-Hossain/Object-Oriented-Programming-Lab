
package abstractdemo;

public class Salary extends Employee{

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public Salary(String name, int number,double salary) {
        super(name, number);
        this.salary = salary;
    }
    
    @Override
    double computePay(){
        System.out.println("Computing monthly salary pay for "+getName());
        return salary/12;
    }
    
    @Override
     void mailCheck(){
        System.out.println("Without mailCheck of Salary class ");
         System.out.println("Mailing check to "+getName()+" with salary "+salary+" and check no: "+getNumber());
    }
}
