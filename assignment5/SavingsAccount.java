package assignment5;

import java.util.Scanner;

public class SavingsAccount
{
	double balance;
	int interestRate;
	int accountNo;
	
	public SavingsAccount(double balance,int interestRate,int accountNo)
	{
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNo=accountNo;
	}
	public void withDraw(double amount)
	{
		if(balance>amount)
		{
			balance=balance-amount;
			System.out.println("Succesfully withdrawn "+ amount);
		}
		else
		{
			System.out.println("error message");
		}
	} 
	public void calculateInterest()
	{
		
		double si=(balance*interestRate)/100;
		System.out.println("Simple interest: "+si);
	}
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn: ");
		double amount=sc.nextInt();
		System.out.println("Enter the balance: ");
		double balance=sc.nextDouble();
		System.out.println("Enter interst rate: ");
		int interestRate=sc.nextInt();
		System.out.println("Enter the account number: ");
		int accountNo=sc.nextInt();
		SavingsAccount s=new SavingsAccount(balance,interestRate,accountNo);
        s.withDraw(amount);
        s.calculateInterest();
    }
}
