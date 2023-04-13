
package testdemo;

public class TestDemo {

    public static void main(String[] args) {
        
        A r,r1,r2;
        r1=new A(1,2);
        r2=new A(3,4);
        r = r1;
        r1=r2;
        r2=r1;
    }
}
