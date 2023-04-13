
package dynaminmethoddispatchandinterface1;

public class IPhone extends Mobile implements GPSInterfaceForMobile{
	public IPhone(String model) {
		super(model);
	}
	
	public int getGPSPosition() {
		return (int)(Math.random()*300);
	}
	
	public int getVelocity() {
		return (int)(Math.random()*70);
	}
	
	public void sendGPSPosition( GPSInterfaceForMobile s) {
		int currentGPSPositon = getGPSPosition();
		System.out.println("sending postion from IPhone "+currentGPSPositon);
		s.receiveGPSPosition(currentGPSPositon);
		
	}
	
	public void receiveGPSPosition(int position) {
		System.out.println("receiving GPS position to IPhone "+position);
	}
	
	void sendingMessage(String message, Mobile m) {
		System.out.println("seding meassge: from IPhone "+message);
		m.receivingMessage(message);
	}
	
	void receivingMessage(String message) {
		System.out.println("Receiving message to IPhone "+message);
	}
}
