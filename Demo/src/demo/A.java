
package demo;

public class A {
    public int a,b;
    public static int c,d;
    public A(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void aMethod(){
        System.out.println(a+" "+b);
    }
    public static void aStaticMethod(){
            System.out.println(c+" "+d);
    }
}
