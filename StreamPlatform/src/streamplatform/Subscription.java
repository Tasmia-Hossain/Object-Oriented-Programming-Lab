
package streamplatform;

import streamingexception.*;


public class Subscription {
    
    public void checkAge(int age,String rating) throws NotApplicableForChildrenException{
        if(age<18 && rating.equals("R")){
            throw new NotApplicableForChildrenException("Not applicable for people under 18");
        }
        else if(age<15 && rating.equals("M")){
            throw new NotApplicableForChildrenException("Not applicable for kids under 15");
        }
        else if(age<18 && (rating.equals("M") || rating.equals("PG"))){
            System.out.println("Applicable for kids");
        }
        
    }
    
    public String buySubscription(String cardNo, String type, double fee) throws CardNotWorkingException {
    int lastTwoDigits = Integer.parseInt(cardNo.substring(cardNo.length() - 2));
    double concession = lastTwoDigits * 0.01;
    if (cardNo.length() == 16 && (type.equals("Mastercard") || type.equals("Visa"))) {
      fee = fee - fee * concession;
      return "Giving " + concession * 100 + "% Concession. Final fee: " + fee;
    } else {
      throw new CardNotWorkingException("Invalid Card");
    }
  }
}