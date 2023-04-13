
package eggshelfexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EggShelfExample {

    public static void main(String[] args) throws IOException {
        
        File f=new File("text.txt");
        f.delete();
        f.createNewFile();
        
        EggShelf es=new EggShelf(10,f);
        
        Employee employee=new Employee(es);
        Customer customer=new Customer(es);
        
        Thread employee1=new Thread(employee,"Employee1");
        Thread employee2=new Thread(employee,"Employee2");
        
        Thread customer1=new Thread(customer,"Customer1");
        Thread customer2=new Thread(customer,"Customer2");
        Thread customer3=new Thread(customer,"Customer3");
        
        employee1.start();
        employee2.start();
        
        customer1.start();
        customer2.start();
        customer3.start();
    }
    
}

class EggShelf{
    File f;
    int numberOfEggBoxes,capacity;
    EggShelf(int capacity,File f){
        this.f=f;
        this.numberOfEggBoxes=0;
        this.capacity=capacity;
    }
    
    synchronized public void putEggBoxes(int howManyEggs,String name) throws IOException{
       while(this.numberOfEggBoxes+howManyEggs>capacity){
           try{
               System.out.println(name+" is waiting,trying to put "+howManyEggs+". The number of eggs would be "+(this.numberOfEggBoxes+howManyEggs));
               FileWriter fw=new FileWriter(f,true);
               fw.write(name+" is waiting,trying to put "+howManyEggs+". The number of eggs would be "+(this.numberOfEggBoxes+howManyEggs)+"\n");
               fw.close();
               wait();
               
           }catch(InterruptedException e){
               System.out.println(e);
           }
       }
       this.numberOfEggBoxes=this.numberOfEggBoxes+howManyEggs;
       FileWriter fw=new FileWriter(f,true);
       fw.write(name+" is putting "+howManyEggs+", the current total number of eggs is "+this.numberOfEggBoxes+"\n");
       fw.close();
       
        System.out.println(name+" is putting "+howManyEggs+", the current total number of eggs is "+this.numberOfEggBoxes);
        notify();
    }
    
    synchronized public void takeEggBoxes(int howManyEggs,String name) throws IOException{
        while(this.numberOfEggBoxes-howManyEggs<0){
            try{
                FileWriter fw=new FileWriter(f,true);
                fw.write(name+" is waiting. "+"The number of eggs is "+this.numberOfEggBoxes+" and she wants to take "+howManyEggs+"\n");
                fw.close();
                
                System.out.println(name+" is waiting. "+"The number of eggs is "+this.numberOfEggBoxes+" and she wants to take "+howManyEggs);
                notify();
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        this.numberOfEggBoxes=this.numberOfEggBoxes-howManyEggs;
        FileWriter fw=new FileWriter(f,true);
        fw.write(name+" is taking "+howManyEggs+", the current total number of eggs in the shelf is "+this.numberOfEggBoxes+"\n");
        fw.close();
        
        System.out.println(name+" is taking "+howManyEggs+", the current total number of eggs in the shelf is "+this.numberOfEggBoxes);
        
        if(this.numberOfEggBoxes<=2)
            notify();
    }
}

class Employee implements Runnable{
    
    EggShelf es;
    Random rm;
    Employee(EggShelf es){
        this.es=es;
        rm=new Random();
    }
    
    @Override
    public void run(){
        //for(int i=0;i<2;i++) {
        int numberOfEggBoxes=1+rm.nextInt(9);
        try{
            es.putEggBoxes(numberOfEggBoxes, Thread.currentThread().getName());
        }catch(IOException e){
            System.out.println(e);
        }
        //}
    }
}

class Customer implements Runnable{
    EggShelf es;
    Random rm;
    Customer(EggShelf es){
        this.es=es;
        rm=new Random();
    }
    @Override
    public void run(){
        //for(int i=0;i<2;i++) {
        int numberOfEggBoxes=1+rm.nextInt(5);
        try{
            es.takeEggBoxes(numberOfEggBoxes, Thread.currentThread().getName());
        }catch(IOException e){
            System.out.println(e);
        }
        //}
    }
}