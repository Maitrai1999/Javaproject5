import java.util.*;
class Account {
	int balance;
	int accountNo;
	void displayBalance() {
		System.out.println("Account No: " + accountNo + "Balance: " + balance);
	}

	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount + " is deposited ");
		displayBalance();
	}
	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount + " is withdrawn ");
		displayBalance();
	}
}
class TransactionDeposit implements Runnable {
	int amount;
	Account accountX;
    TransactionDeposit(Account x, int amount) {
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}

	public void run() {
		accountX.deposit(amount);
	}
}
	class TransactionWithdraw implements Runnable {
		int amount;
		Account accountY;
        TransactionWithdraw(Account y,int amount){
			accountY = y;
			this.amount = amount;
			new Thread(this).start();
		}
		public void run() {
			accountY.withdraw(amount);
		}
	}
	public class BankAccount {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Account Number: ");
			int AccountNumber=s.nextInt();
			System.out.println("Your Balance: ");
			int Balance=s.nextInt();
			Account obj = new Account();
			System.out.println("Deposit Amount: ");
			int Deposit=s.nextInt();
			Balance=Balance+Deposit;
			System.out.println("Balance after deposited: "+ Balance);
			Balance=Balance+Deposit;			
			/*obj.balance = 1000;
			obj.accountNo = 12345;
			123
			TransactionDeposit t1;
			TransactionWithdraw t2;
			t1 = new TransactionDeposit();
			t2 = new TransactionWithdraw();*/
		}
	}

	





	




