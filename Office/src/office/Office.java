
package office;

import java.util.Scanner;

public class Office {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String oname,fname,lname;
        double salary;
        
        System.out.println("Enter Office Name: ");
        oname=input.nextLine();
        
        System.out.println("Enter First Name: ");
        fname=input.nextLine();
        
        System.out.println("Enter Last Name: ");
        lname=input.nextLine();
        
        System.out.println("Enter Monthly Salary: ");
        salary=input.nextDouble();
        
        Staff obj1=new Staff(oname);
        Staff obj2=new Staff(fname,lname,salary);
        System.out.println("Name of Office is "+obj1.officeName);
        System.out.println("Annual Salary of "+obj2.getFirstName()+" "+obj2.getLastName()+" is "+obj2.AnnualSalary());
    }
    
}
