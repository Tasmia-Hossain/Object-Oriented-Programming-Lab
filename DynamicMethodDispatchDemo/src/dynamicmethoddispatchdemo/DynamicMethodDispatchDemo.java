
package dynamicmethoddispatchdemo;

public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {
        
        OneBank ob=new OneBank("One Bank Ltd",7);
        BracBank bb=new BracBank("Brac Bank Ltd",6.5);
        DutchBanglaBank dbb=new DutchBanglaBank("Dutch Bangla Bank Ltd",8);
        XBank xb=new XBank("X Bank Ltd",9);
        
        System.out.println(Bank.whoHasHightestInterest(ob, xb));
        System.out.println(Bank.whoHasHightestInterest(dbb, ob));
        System.out.println(Bank.whoHasHightestInterest(bb, dbb));
        
    }
    
}
