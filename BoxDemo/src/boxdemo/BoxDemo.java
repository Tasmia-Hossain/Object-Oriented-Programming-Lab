
package boxdemo;

public class BoxDemo {

    public static void main(String[] args) {
        Box pencilBox,matchBox;
        pencilBox=new Box();
        matchBox=new Box();
        BoxWeight myBox=new BoxWeight(1.0,4.0,3.0,5.5);
        
        pencilBox.setHeight(1.0);
        pencilBox.setWidth(2.0);
        pencilBox.setDepth(3.0);
        
        matchBox.setHeight(4.0);
        matchBox.setWidth(5.0);
        matchBox.setDepth(6.0);
        
        System.out.println("Pencil Box Height="+pencilBox.getHeight());
        System.out.println("Pencil Box Width="+pencilBox.getWidth());
        System.out.println("Pencil Box Depth="+pencilBox.getDepth());
        System.out.println("Pencil Box Volume="+pencilBox.calculateVolume());
        
        System.out.println("\nMatch Box Height="+matchBox.getHeight());
        System.out.println("Match Box Width="+matchBox.getWidth());
        System.out.println("Match Box Depth="+matchBox.getDepth());
        System.out.println("Match Box Volume="+matchBox.calculateVolume());
        
        
        System.out.println("My Box Weight="+myBox.weight);
        System.out.println("My Box Volume="+myBox.calculateVolume());
        
    }
    
}
