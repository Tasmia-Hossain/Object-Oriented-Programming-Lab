
package makestring;

public class MakeString {

    public static void main(String[] args) {
        //Construct one string from another
    /*    char c[]={'J','a','v','a'};
        String s1=new String(c);
        String s2=new String(s1);
        
        System.out.println(s1);
        System.out.println(s2);
    */   
        //construct string from subset of char array
    /*    byte ascii[]={65,66,67,68,69,70};
        String s1=new String(ascii);
        System.out.println(s1);
        
        String s2=new String(ascii,2,3);
        System.out.println(s2);
    */
        //string length
    /*    char chars[]={'a','b','c'};
        String s=new String(chars);
        System.out.println(s.length());
    */
        //string literal
    /*    String s="abc";
        System.out.println("abc".length());
    */
        //string concatenation
    /*    String age="9";
        String s="He is "+age+" years old";
        System.out.println(s);
        
        String s2="four: "+(2+2);
        System.out.println(s2);
    */
        //charAt()
        char ch;
        ch="abc".charAt(1);
        System.out.println(ch);
    }
    
}
