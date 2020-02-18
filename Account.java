package lab4.com;

public class Account {
	private String accName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public int getBlance() {
		return blance;
	}
	public void setBlance(int blance) {
		this.blance = blance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	private String acid;
	private int blance;
	private int deposit;
	private int withdraw;
	
	public void showinfo() {
		  System.out.println(accName+" :"+acid+" :"+blance+":"+deposit+":"+withdraw);
		 
	}
	
	public String toString() {
		return "Account [accName=" + accName + ", acid=" + acid + ", blance=" + blance + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + "]";
	}
	

	

	
}


