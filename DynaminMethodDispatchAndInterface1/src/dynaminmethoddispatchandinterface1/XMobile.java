
package dynaminmethoddispatchandinterface1;

public class XMobile extends Mobile implements GPSInterfaceForMobile{
	XMobile(String model) {
		super(model);
	}
	void sendingMessage(String message, Mobile m) {
		System.out.println("seding meassge from  XMobile "+message);
		m.receivingMessage(message);
	}
	
	void receivingMessage(String message) {
		System.out.println("Receiving message to XMobile "+message);
	}
	@Override
	public void sendGPSPosition(GPSInterfaceForMobile s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void receiveGPSPosition(int position) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getGPSPosition() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

