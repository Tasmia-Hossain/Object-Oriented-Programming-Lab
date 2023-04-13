
package studentarray;

import java.util.Scanner;


public class StudentArray {
  
    public static void main(String[] args) {
        Student cse12SecA[]=new Student[50];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<cse12SecA.length;i++){
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter ID: ");
            String id=sc.nextLine();
            cse12SecA[i]=new Student(name,id);
            System.out.println("Name: "+cse12SecA[i].name); 
            System.out.println("ID: "+cse12SecA[i].id); 
        }
        
    }
    
}
