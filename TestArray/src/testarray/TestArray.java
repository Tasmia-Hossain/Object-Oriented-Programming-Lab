
package testarray;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int arraySize=input.nextInt();
        
        int array[]=new int[arraySize];
        
        for(int i=0;i<arraySize;i++){
            System.out.print("Element "+(i+1)+": ");
            array[i]=input.nextInt();
            
        }
        
        System.out.print("ARRAY: ");
        for(int i=0;i<arraySize;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
