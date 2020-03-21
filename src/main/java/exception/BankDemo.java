package exception;

//文件名称 BankDemo.java
public class BankDemo {
	
	 public static void main(String [] args){
		 
		 CheckingAccount ca = new CheckingAccount(101);
		 
		 System.out.println("Depositing $500...");
		 
		 ca.deposit(500.00);
		 
		 System.out.println("余额为：" + ca.getBalance());
		 
		 try {
			 
			System.out.println("\nWithdrawing $100...");
			ca.withdraw(100);
			System.out.println("\nWithdrawing $600...");
			ca.withdraw(600);
			
			
		} catch (InsufficientFundsException e) {
			
			System.out.println("Sorry, but you are short $"
                    + e.getAmount());
			e.printStackTrace();
			
		}
		 
	 }

}
