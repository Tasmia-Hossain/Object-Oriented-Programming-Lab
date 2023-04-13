
package boxdemo2;

public class BoxDemo2 {

    public static void main(String[] args) {
        Box pencilBox,matchBox;
        pencilBox=new Box();
        matchBox=new Box();
        
        //pencilBox.setvariable(1.0, 2.0, -3.0, "Plastic");
        pencilBox.setDepth(3.0);
        
        System.out.println("Pencil Box Length="+pencilBox.getLength());
        System.out.println("Pencil Box Width="+pencilBox.getWidth());
        System.out.println("Pencil Box Depth="+pencilBox.getDepth());
        System.out.println("Pencil Box Volume="+pencilBox.calculateVolume());
        System.out.println("Pencil Box Material="+pencilBox.material);
    }
    
}
