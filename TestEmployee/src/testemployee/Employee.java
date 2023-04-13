
package testemployee;

public class Employee {
    static String organization;
    //private int eid;
    //private String name;
    //private String designation;
    //private int age;
    public static String changeOrganization(String organization){
        Employee.organization=organization;
        return Employee.organization;
    }
    
}
