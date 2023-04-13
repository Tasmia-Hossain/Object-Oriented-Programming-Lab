
package passworddemo;
import java.util.Scanner;
public class PasswordDemo {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int k=0;
        try{
            String str=input.nextLine();
            try{
                if(str.matches(".*[A-Z].*")==false)throw new UppercaseException ("Need at least one Uppercase character");
                else
                    k++;           
            }catch(UppercaseException ex){
                System.out.println(ex);
            }
            try{
                if(str.matches(".*[a-z].*")==false)throw new LowercaseException("Need at least one Lowercase character");
                else
                    k++;
            }catch(LowercaseException ex){
                System.out.println(ex);
            }
            try{
                if(str.matches(".*[0-9].*")==false)throw new DigitException("Need at least one digit");
                else 
                    k++;
            }catch(DigitException ex){
                System.out.println(ex);
            }
            try{
                if(str.length()<=8)throw new InvalidLengthException("Password must be over 8 characters");
                else
                    k++;
            }catch(InvalidLengthException ex){
                System.out.println(ex);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        if (k==4)
            System.out.println("Password is okay!!");
    }
}

 class UppercaseException extends RuntimeException{
    
    UppercaseException(String m){
        super(m);
    }
}

 class LowercaseException extends RuntimeException{
    
    LowercaseException(String m){
        super(m);
    }
}

 class DigitException extends RuntimeException{
    
    DigitException(String m){
        super(m);
    }
}

 class InvalidLengthException extends RuntimeException{
    
    InvalidLengthException(String m){
        super(m);
    }
}
