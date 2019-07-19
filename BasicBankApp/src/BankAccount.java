public class BankAccount {

	private int accNum;
	private String name;
	private double ammount;
	
	
	public void insert(int accNum, String name, double ammount) {
		this.accNum = accNum;
		this.name = name;
		this.ammount = ammount;

	}

	public void deposit(double amt) {
		ammount = ammount + amt;
		System.out.println("amount depoisted"+ ammount);

	}

	public void withdraw(double amt) {
		if (ammount < amt) 
			System.out.println("in valid amount");
		 else {
			ammount = ammount - amt;
		 System.out.println("amount withralled");
		 }
	}

	public void checkBalance(){
		System.out.println("amount is:"+ ammount);
	}
	public void display() {
		System.out.println("accNum: "+ accNum + " name: "+ name +" amount: "+ ammount);
	}

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.insert(252, "ajay", 2500);
		ba.display();
		ba.deposit(200);
		
		ba.checkBalance();
		ba.withdraw(200);
		ba.checkBalance();
	
	}

}
