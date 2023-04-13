

package dynaminmethoddispatchandinterface1;

public class DynaminMethodDispatchAndInterface1 {

    public static void main(String[] args) {
        
        IPhone iphone5s = new IPhone("IPhone5s");
		SumsungMobile A30 = new SumsungMobile("A30");
		WaltonMobile ZX3 = new WaltonMobile("ZX3");
		XMobile xm = new XMobile("sm101");
		ShahriarMobile sm = new ShahriarMobile("SM1");
		
		iphone5s.sendingMessage("Hello", ZX3);
		
		iphone5s.makeACall(sm);
	
		//iphone5s.sendingMessage("Hello", ZX3);
		
		iphone5s.sendGPSPosition(xm);
		
		//A30.sendGPSPosition(ZX3);
		
		//A30.sendGPSPosition(sm);
    }
    
}
