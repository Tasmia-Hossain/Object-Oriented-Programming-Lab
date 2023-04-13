
package testemployee;

public class TestEmployee {
    
    static String className;  /*or declare the variable static*/

    public static void main(String[] args) {
    /*Similar case for variables*/
        //TestEmployee tp=new TestEmployee();
        //tp.className="Test Employee Class";
        //printClassName();
        
        className="Test Employee";
        printClassName();
        
        //Employee.organization="AUST";
        //System.out.println(Employee.organization);
        
    /*You will need to create object for Calling methods in Main method*/
        //TestEmployee obj=new TestEmployee();
        //obj.printClassName();
        
    /*Or you can make the method static*/
        //TestEmployee.printClassName();
        
    /*Or call it directly without the Class name*/
        //printClassName();
    }
    /* make the method static*/
    public static void printClassName(){
        //System.out.println("Class name is Test Employee");
        System.out.println("Class name is"+" "+className);
    }
    
}
