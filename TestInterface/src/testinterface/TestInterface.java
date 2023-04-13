
package testinterface;

public class TestInterface {

    public static void main(String[] args) {
       
        A obj=new A();
        obj.print();
        obj.show();
        obj.display();
       
       Printable p=new A();
       p.print();
      
    }
    
}
