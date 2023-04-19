package t1;

import java.util.ArrayList;

import java.util.Scanner;
import t1.Validate;
//Task 2: ATM interface

public class Task2 {
	
	private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
    
	public static void main(String[] args) {
		
		
		 Validate v1=new Validate();
		 Account account = new Account();
	        boolean quit = false;
	        
	        while (!quit) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Transfer");
	            System.out.println("4. Transaction History");
	            System.out.println("5. Quit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    scanner.nextLine();
	                    account.deposit(depositAmount);
	                    System.out.printf("New balance: $%.2f\n", account.getBalance());
	                    transactionHistory.add(new Transaction(Transaction.Type.DEPOSIT, depositAmount));
	                    break;
	                    
	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    scanner.nextLine();
	                    if (account.withdraw(withdrawAmount)) {
	                        System.out.printf("New balance: $%.2f\n", account.getBalance());
	                        transactionHistory.add(new Transaction(Transaction.Type.WITHDRAWAL, withdrawAmount));
	                    } else {
	                        System.out.println("Insufficient funds!\n Please deposit some funds to withdraw");
	                    }
	                    break;
	                    
	                case 3:
	                    System.out.print("Enter recipient's account number: ");
	                    String recipient = scanner.nextLine();
	                    System.out.print("Enter transfer amount: ");
	                    double transferAmount = scanner.nextDouble();
	                    scanner.nextLine();
	                    if (account.transfer(recipient, transferAmount)) {
	                        System.out.printf("New balance: $%.2f\n", account.getBalance());
	                        transactionHistory.add(new Transaction(Transaction.Type.TRANSFER, transferAmount));
	                    } else {
	                        System.out.println("Transfer failed! Please check the recipient's account number.");
	                    }
	                    break;
	                    
	                case 4:
	                    System.out.println("Transaction History:");
	                    for (Transaction t : transactionHistory) {
	                        System.out.println(t);
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("Thank you for using our ATM!");
	                    quit = true;
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice!");
	                    break;
	            }
	        }
	    }
	
	}

