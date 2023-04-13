
package dynamicmethoddispatchdemo;

public class Bank{
	private double interestRate;
	private String bankName;
	
	public Bank(String bankName, double interestRate) {
		super();
		this.bankName = bankName;
		this.interestRate = interestRate;
	}
		
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	static String whoHasHightestInterest(Bank b1, Bank b2){
		String bankName="";
		
		if(b1.getInterestRate() >= b2.getInterestRate()){
			bankName=b1.getBankName();
		}else{
			bankName=b2.getBankName();	
		}
		
		return bankName;
	}
	
}