
package threaddemo;

public class Producer implements Runnable{
    
     String  name;
//    public Producer(String name){
//        this.name=name;
//    }
    
//    public void run(){
//        for(int i=0;i<=5;i++){
//            System.out.println("Thread: "+name+" : "+i);
//        }
//    }
    
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread: "+Thread.currentThread().getName()+" "+i);
            
//            if(Thread.currentThread().getName().equals("T1")){
//            try{
//                Thread.sleep(500);
//            }catch(InterruptedException ex){
//                System.out.println(ex);
//            }
//           } 
//        
//        else{
//               try{
//                Thread.sleep(2500);
//            }catch(InterruptedException ex){
//                System.out.println(ex);
//            }
//        } 
                
        
        }
    }
}
