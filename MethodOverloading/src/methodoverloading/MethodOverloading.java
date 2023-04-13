
package methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        Adder objAdder=new Adder();
        objAdder.add(2,3);
        objAdder.add(2,3,4 );
        objAdder.add(5.6,1.2 );
        objAdder.add(2.6,3.3,4.5 );
    }
    
}
