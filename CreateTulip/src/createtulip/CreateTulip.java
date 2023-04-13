
package createtulip;

public class CreateTulip {

    public static void main(String[] args) {
        Tulip redTulip=new Tulip("red",2);
        Tulip whiteTulip=new Tulip("white",4);
        Tulip yellowTulip=new Tulip("yellow",5);
        
        System.out.println("Properties of 1st Tulip object");
        System.out.println(redTulip.getHeight()+" feet");
        System.out.println(redTulip.getColor());
        
        System.out.println("Properties of 2nd Tulip object");
        System.out.println(whiteTulip.getHeight()+" feet");
        System.out.println(whiteTulip.getColor());
        
       /* Tulip mixedTulip1=redTulip.mixTulip(whiteTulip);
        System.out.println("\nProperties of 1st Mixed Tulip odject");
        System.out.println(mixedTulip1.getHeight());
        System.out.println(mixedTulip1.getColor());
        
        Tulip mixedTulip2=whiteTulip.mixTulip(whiteTulip);
        System.out.println("\nProperties of 2nd Mixed Tulip odject");
        System.out.println(mixedTulip2.getHeight());
        System.out.println(mixedTulip2.getColor());  */
       
       Tulip mixedTulip2=redTulip.mixTulip(yellowTulip, whiteTulip);
        System.out.println(mixedTulip2.getHeight());
        System.out.println(mixedTulip2.getColor());
    }
    
}
