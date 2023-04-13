
package dynaminmethoddispatchandinterface1;

public class SumsungMobile extends Mobile implements GPSInterfaceForMobile {
    
    public SumsungMobile(String model) {
		super(model);
	}
	
	public int getGPSPosition() {
		return (int)(Math.random()*100);
	}
	
	public int getVelocity() {
		return (int)(Math.random()*50);
	}
	
	public void sendGPSPosition(GPSInterfaceForMobile s) {
		int currentGPSPositon = getGPSPosition();
		System.out.println("sending postion from Sumsung " +currentGPSPositon);
		s.receiveGPSPosition(currentGPSPositon);
		
	}
	
    @Override
	public void receiveGPSPosition(int position) {
		System.out.println("receiving GPS position to Sumsung " +position);
	}

    @Override
	void sendingMessage(String message, Mobile m) {
		System.out.println("seding meassge from Sumsung "+message);
		m.receivingMessage(message);
	}
	
    @Override
	void receivingMessage(String message) {
		System.out.println("Receiving message to Sumsung " +message);
	}
    
}
