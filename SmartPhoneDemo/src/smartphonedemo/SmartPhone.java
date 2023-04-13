
package smartphonedemo;

public class SmartPhone {
         public String maker;
         public String os;
         public int modelNum;
         
         public SmartPhone(){
             
         }
         public SmartPhone(String m){
             maker=m;
             
         }
         public SmartPhone(String m,int mn){
             maker=m;
             modelNum=mn;
         }
         
         public SmartPhone(String m,String o){
             maker=m;
             os=o;
         }
         public SmartPhone(String m,String o,int mn){
             maker=m;
             os=o;
             modelNum=mn;
         }
         
         public void setVariable(String m,String o,int mn){
             maker=m;
             os=o;
             modelNum=mn;
         }
}
