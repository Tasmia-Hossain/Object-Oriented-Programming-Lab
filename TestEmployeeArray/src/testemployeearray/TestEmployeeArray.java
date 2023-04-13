
package testemployeearray;

public class TestEmployeeArray {

    public static void main(String[] args) {
        Employee[] employeeArray=new Employee[3];
        employeeArray[0]=new Employee(1,"Robert","Manager",35);
        employeeArray[1]=new Employee(2,"Danielle","CEO",40);
        employeeArray[2]=new Employee(3,"Amy","Developer",27);
        
        for(int i=0;i<employeeArray.length;i++){
            int id=employeeArray[i].getEid();
            String name=employeeArray[i].getName();
            String designation=employeeArray[i].getDesignation();
            int age=employeeArray[i].getAge();
            System.out.println("Employee ID: "+id+"   Name: "+name+"   Designation: "+designation+"   Age: "+age);
        }
         
    }
    
}
