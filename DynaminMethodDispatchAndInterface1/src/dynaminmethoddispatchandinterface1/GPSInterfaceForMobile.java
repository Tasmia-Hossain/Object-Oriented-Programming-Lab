
package dynaminmethoddispatchandinterface1;

public interface GPSInterfaceForMobile {
    
        void sendGPSPosition(GPSInterfaceForMobile s);
	void receiveGPSPosition(int position);
	int getGPSPosition();
}
