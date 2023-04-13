
package developer;

public class Developer extends Employee{
    
    int bonus=10000;

    public static void main(String[] args) {
        
        Developer objDev=new Developer();
        System.out.println("Developer salary is:"+objDev.salary);
        System.out.println("Developer salary is:"+objDev.bonus);
    }
}
