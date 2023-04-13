
package tabledemo;

public class TableDemo {

    public static void main(String[] args) {
        Table myOldTable=new Table(3,2,4);
        Carpenter carpenterRahim=new Carpenter("Rahim","Tejgaon","01521741282");
        
        Table myNewTable1=carpenterRahim.makeATable(myOldTable,-0.5,0,0.5);
        Table myNewTable2=carpenterRahim.makeATable(myOldTable);
        
        System.out.println("My Table Change Height:"+myNewTable1.height);
        System.out.println("My Table Change Top Widht:"+myNewTable1.topWidth);
        System.out.println("My Table Change Top Length:"+myNewTable1.topLength);
        
        System.out.println("My Old Table Height:"+myNewTable2.height);
        System.out.println("My Old Table Top Width:"+myNewTable2.topWidth);
        System.out.println("My Old Table Top Length:"+myNewTable2.topLength);
    }
    
}
