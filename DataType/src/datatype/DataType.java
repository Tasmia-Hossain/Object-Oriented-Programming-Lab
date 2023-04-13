
package datatype;

public class DataType {

  
    public static void main(String[] args) {
     
        boolean b = true;  //Dynamic initialization
        char c='a';
        short s=32677;
        int i=1265877;
        float f=10.2f;
        double d=10.21131141;
        
        System.out.printf("Boolean b = %b\n",b);     //format specifier
        System.out.printf("Character c = %c \n",c);  //format specifier er jonno printf use korte hobe
        System.out.printf("Short s = %d\n",s);           
        System.out.println("Integer i = "+i);  //-->%d   //format specifier charao print kora jay
        System.out.printf("Float f = %.1f \n",f);
        System.out.printf("Double d = %.3f\n",d);   
    }
    
}
