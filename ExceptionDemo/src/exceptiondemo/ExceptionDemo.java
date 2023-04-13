
package exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

    public static void main(String[] args) {
        
        /////Unchecked Exception
       /* 
        try{
        int data =10/0;
        
        }catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
        System.out.println("rest of the code...");
        */
       
       /*
       try{
           int a[]=new int[5];
           a[5]=30/5;
       }catch(ArithmeticException e){
           System.out.println("task 1 completed");
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("task 2 completed");
       }catch(Exception e){
           System.out.println("common task completed");
       }
        System.out.println("rest of the code...");
        */
       
       /*
       try{
           try{
               System.out.println("going to divide");
               int b=39/0;
           }catch(ArithmeticException e){
               System.out.println(e);
           }
           try{
               int a[]=new int[5];
               a[5]=4;
           }catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e);
           }
           System.out.println("other statement");
       }catch(Exception e){
           System.out.println("handeled");
       }
        System.out.println("normal flow..");
        */
       
       /*
       int a[]=new int[2];
       try{
           System.out.println(a[3]);
           
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }finally{
           a[0]=6;
           System.out.println("First element value: "+a[0]);
           System.out.println("The finally statement is executed");
       }
    */
       
       /////Checked Exception
       /*
       try{
        File file=new File("file.txt");
        FileReader fr=new FileReader(file);
        
       }catch(FileNotFoundException e){
           System.out.println(e);
       }
       */
       
       /////Throw Customized Exception
       int age=12;
       if(age<18){
           try{
               throw new FileNotFoundException();
               
           }catch(FileNotFoundException ex){
               System.out.println(ex);
           }
       }
       
       /*
       validate(3);
        System.out.println("rest of the code...");
    }
    
    static void validate(int age){
        try{
            if(age<18){
                throw new ArithmeticException("not valid");
            }else{
                System.out.println("welcome to vote");
            }
        }catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
        */
    }
    
}
