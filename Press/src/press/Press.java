
package press;

import java.util.Scanner;

public class Press {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Handled name: "+Handle.convertToHandle(name));
    }
    
}
