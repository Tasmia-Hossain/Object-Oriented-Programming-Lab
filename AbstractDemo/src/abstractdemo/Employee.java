
package abstractdemo;

public abstract class Employee {
    private String  name;
    private String address;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    Employee(String name,String address,int number){
        
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    abstract double computePay();
    
    void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }
}
