
package dynaminmethoddispatchandinterface1;

public class WaltonMobile extends Mobile{
	WaltonMobile(String model) {
		super(model);
	}
	void sendingMessage(String message, Mobile m) {
		System.out.println("seding meassge from XMobile "+message);
		m.receivingMessage(message);
	}
	
	void receivingMessage(String message) {
		System.out.println("Receiving message from XMobile "+message);
	}
}
