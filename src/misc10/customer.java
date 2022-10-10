package misc10;

 class customer {
 public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


int customerid;
 String CustomerName;
 String emailid;
 
 
public customer(int customerid,String CustomerName,String emailid)
{
	this.customerid=customerid;
	this.CustomerName=CustomerName;
	this.emailid=emailid;
}
}
abstract class account
{
	int accountNumber;
	customer cobj;
	double balance;
	public account(int accountNumber,customer cobj,double balance)
	{
		this.accountNumber=accountNumber;
		this.cobj=cobj;
		this.balance=balance;
	}
	abstract public boolean withdraw(double amount);

	
}
 abstract class  SavingsAcoount extends account
{
	private double minimumBalance;
	

	public SavingsAcoount(int accountNumber, customer cobj, double balance,double minimumBalance) {
		super(accountNumber, cobj, balance);
		
	}
	public boolean withdraw(double amount)
	{
		if(balance> minimumBalance)
		{
			return true;
		}else 
			return false;
	}
	
}
 
	class main
	{
		public static void main(String[] args) {
			

		}
	 
	}


	


