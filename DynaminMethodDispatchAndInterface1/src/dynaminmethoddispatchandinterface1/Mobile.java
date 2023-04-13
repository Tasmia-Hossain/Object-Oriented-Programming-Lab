
package dynaminmethoddispatchandinterface1;

public abstract class Mobile {
    
    String model;
	Mobile(String model){
		this.model = model;
	}
	
	void makeACall(Mobile m) {
		System.out.println(model + " is calling "+m.model);
		m.receiveCall();
	}
	
	void receiveCall() {
		System.out.println(model+ " is receiving call");
	}
	
	abstract void sendingMessage(String message, Mobile m);
	abstract void receivingMessage(String message);
}
