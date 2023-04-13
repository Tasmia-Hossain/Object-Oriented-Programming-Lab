
package streamplatform;

import streamingexception.CardNotWorkingException;
import streamingexception.NotApplicableForChildrenException;

public class StreamPlatform {

    public static void main(String[] args) {
        
        Subscription subscription = new Subscription();
    try {
      String result = subscription.buySubscription("1234567890123456", "Visa", 100.0);
      System.out.println(result);
      subscription.checkAge(17, "G");
    } catch (NotApplicableForChildrenException e) {
      System.out.println(e.getMessage());
    } catch (CardNotWorkingException e) {
      System.out.println(e.getMessage());
    }
    }
    
}
