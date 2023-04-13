
package beginnerjava;

import java.util.Scanner;

public class ArithmeticOperator {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
       
        System.out.print("Enter first number : ");
        num1= input.nextInt();
        
        System.out.print("Enter second number : ");
        num2= input.nextInt();
        
        result= num1+num2;
        System.out.println("Sum = "+result);
        
        result= num1-num2;
        System.out.println("Sub = "+result);
        
        result= num1*num2;
        System.out.println("Multiplication = "+result);
        
        double result2= (double)num1/num2;   //type casting
        System.out.printf("Div = %.2f\n",result2);
        
        result= num1%num2;
        System.out.println("Reminder = "+result);
    }
    
}
