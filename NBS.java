class Bank{
private int amount;

public void deposit(int money){
	amount+=money;
 	}

public void withdraw (int money){
 if (money<amount){
 	amount=money;
 }
 else{
 	System.out.println("Not enough funds");
 }
}

public void balance(){
		System.out.println("Your balance is £"+ amount);
	}

public Bank(){
	System.out.println("Welcome to The Bank");
}
}

class NBS{
	public static void main(String xyz[]){
		Bank abc;
		abc= new Bank();
		abc.deposit(200);
		abc.withdraw(100);
		abc.balance();
	}
}