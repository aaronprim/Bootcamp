package com.Bootcamp.java.OOP.BankAccount.BankAccountAssignment;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	
	public static int numberOfAccounts;
	public static int totalStored;
	
	private static Random random = new Random();
	
	private static String randomNumber() {
		return Integer.toString(random.nextInt((1000000000) + 1000000000));	
	}
	
	public BankAccount() {
		this.accountNumber = BankAccount.randomNumber();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccounts++;
	}
	
	public BankAccount( double checkingBalance, double savingBalance) {
		this.accountNumber = BankAccount.randomNumber();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingBalance;
		numberOfAccounts++;
		totalStored += (this.checkingBalance + this.savingsBalance);
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void depositMoney(double depositAmount, String accountType) {
		if (accountType == "checkingBalance" || accountType == "checking") {
			this.checkingBalance += depositAmount;
			totalStored += depositAmount;
			System.out.println("Deposit Complete: $" + depositAmount + " has been added to checking account Number #" + this.accountNumber);
		}
		
		else if (accountType == "savingsBalance" || accountType == "savings") {
			this.savingsBalance += depositAmount;
			totalStored += depositAmount;
			System.out.println("Deposit Complete: $" + depositAmount + " has been added to savings account Number #" + this.accountNumber);
		}
	}
	
	public void withdrawMoney(double withdrawAmount, String accountType) {
		if (accountType == "checkingBalance" || accountType == "checking") {
			if (withdrawAmount <= this.checkingBalance) {
				this.checkingBalance -= withdrawAmount;
				totalStored -= withdrawAmount;
				System.out.println("Withdrawl Complete: $" + withdrawAmount + " has been withdrawn from checking account Number #" + this.accountNumber);
			}
		
			else {
				System.out.println("You do not have the funds to complete this transaction");
			}
		}
		
		else if (accountType == "savingsBalance" || accountType == "savings") {
			if (withdrawAmount <= this.savingsBalance) {
				this.savingsBalance -= withdrawAmount;
				totalStored -= withdrawAmount;
				System.out.println("Withdrawl Complete: $" + withdrawAmount + " has been withdrawn from savings account Number #" + this.accountNumber);
			}
		
			else {
				System.out.println("You do not have the funds to complete this transaction");
			}
		}
		
	}
		
	public void accountBalance() {
		System.out.println("The balance of the two accounts is: $" + (this.getCheckingBalance() + this.getSavingsBalance()));
	}
	
		
		
}
