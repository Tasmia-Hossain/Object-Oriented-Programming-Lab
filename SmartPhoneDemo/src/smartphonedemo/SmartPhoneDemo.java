
package smartphonedemo;

public class SmartPhoneDemo {

    public static void main(String[] args) {
        SmartPhone obj1,obj2;
        obj1=new SmartPhone("Samsung","Android",10);
        obj2=new SmartPhone("Apple");
        
        //obj1.setVariable("Samsung","Android",10);
        //obj2.setVariable("Apple","IOS",14);
        
        System.out.println(obj1.maker);
        System.out.println(obj1.os);
        System.out.println(obj1.modelNum);
        
        System.out.println(obj2.maker);
        System.out.println(obj2.os);
        System.out.println(obj2.modelNum);
        
        
    }
    
}
