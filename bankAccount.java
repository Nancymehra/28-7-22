import java.util.Scanner;

public class bankAccount
{
	
public static void main(String args[]){
	
								//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Account Holder name : ");
	String userName = scan.next();
	System.out.println("Enter Account Number :");
	int accountNum = scan.nextInt();
	System.out.println("Enter Account Balance : ");
	int balance = scan.nextInt();
	System.out.println("Enter Amount you want to deposit or withdraw :");
	int amount = scan.nextInt();
	System.out.println("  ");
	
							//creating an object named user of class customer
	customer user = new customer();
	
							//callng createAccount method of customer class using user object
	user.createAccount(userName,accountNum,balance);	
	
	user.depositAmount(amount); 				//calling depositAmount method
	user.getAmount();				//calling getAmount method
	user.withdrawAmount(amount);			 //calling withdrawAmount method
	
							//callng getDetail method of movie class 
	user.getDetail();
	scan.close();
}
}

class customer
{
								//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
								//creating method createAccount to store information of user
	public void createAccount(String name,int num,int bal)
	{
		userName = name;
		accountNum = num;
		balance = bal;
			
	}
	
								//creating withdrawAmount method to delete amount from balance
	public void withdrawAmount(int amount)
	{
		balance -= amount;
		System.out.println(userName+" your current balance after withdrawing Rs. "+amount+" is : "+balance);
	}
	
								//creating depositAmount method to add amount
	public void depositAmount(int amount)
	{
		balance += amount;
		System.out.println(userName+" your current balance after depositing Rs."+amount+" is : "+balance);
	}
	
								//creating getAmount method to check balance
	public void getAmount()
	{
		System.out.println(userName+" your current balance is : "+balance);
	}
	
								//Creating method getDetail to display information of User
	public void getDetail()
	{
		System.out.println("ACCOUNT DETAILS");
		System.out.println("Account Holder  NAME : "+ userName );
		System.out.println("Account Number : "+accountNum);
		System.out.println("Account Balance: Rs."+balance+"/-");
	}
}