
package staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        Test obj1=new Test();
        Test obj2=new Test();
        Test obj3=new Test();
        
        System.out.println(obj1.i);
        obj2.i=5;
        System.out.println(obj2.i);
        System.out.println(obj3.i);
    }
    
}
