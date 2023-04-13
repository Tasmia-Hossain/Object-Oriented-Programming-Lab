
package tabledemo;

public class Carpenter {
    public String name,address;
    public String mobileNo;
    
    public Carpenter(String name,String address,String mobileNo){
        this.name=name;
        this.address=address;
        this.mobileNo=mobileNo;
    }
    
    public Table makeATable(double height,double topWidth,double topLength){
        Table newTable=new Table(height,topWidth,topLength);
        return newTable;
    }
    
    public Table makeATable(Table aTable){
        Table newTable=new Table(aTable.height,aTable.topWidth,aTable.topLength);
        return newTable;
    }
    
    public Table makeATable(Table aTable,double modifyHeight,double modifyTopWidth,double modifyTopLength){
        Table newTable=new Table(aTable.height+modifyHeight,aTable.topWidth+modifyTopWidth,aTable.topLength+modifyTopLength);
        return newTable;
    }
}
