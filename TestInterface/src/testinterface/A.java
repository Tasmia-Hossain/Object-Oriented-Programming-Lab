
package testinterface;

public class A extends ImplementedClass implements Printable,Showable{
    
    @Override
    public void print(){
        System.out.println("Printing Class A");
    }
    
    @Override
    public void show(){
        System.out.println("Showing Class A");
    }
    
    @Override
    public void display(){
        System.out.println("Displaying Class A");
    }
    
    public void className(){
        System.out.println("Class Name is A");
    }
}
