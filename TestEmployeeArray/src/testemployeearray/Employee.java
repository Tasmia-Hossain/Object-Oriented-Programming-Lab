
package testemployeearray;

public class Employee {
    private static String organization;
    private int eid;
    private String name,designation;
    private int age;

    public static String getOrganization() {
        return organization;
    }

    public static void setOrganization(String organization) {
        Employee.organization = organization;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Employee(){
        
    }

    public Employee(int eid, String name, String designation, int age) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.age = age;
    }
    
    
}
