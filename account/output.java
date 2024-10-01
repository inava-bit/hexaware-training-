package account;
import java.util.Scanner;
public class output {
	// Main class to handle the menu-driven Bank Account Management System
	public class BankAccountManagementSystem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        output account = null;
	        int choice = 0;
	        do {
	            System.out.println("\n--- Bank Account Management System ---");
	            System.out.println("1. Create a new account");
	            System.out.println("2. Deposit money");
	            System.out.println("3. Withdraw money");
	            System.out.println("4. Check balance");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            try {
	                choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        if (account != null) {
	                            System.out.println("Account already exists.");
	                        } else {
	                            account = new output();
	                            System.out.println("Bank account created successfully.");
	                        }
	                        break;
	                    case 2:
	                        if (account == null) {
	                            throw new NullPointerException("No account found. Please create an account first.");
	                        }
	                        System.out.print("Enter amount to deposit: ");
	                        double depositAmount = sc.nextDouble();
	                        account.deposit(depositAmount);
	                        break;
	                    case 3:
	                        if (account == null) {
	                            throw new NullPointerException("No account found. Please create an account first.");
	                        }
	                        System.out.print("Enter amount to withdraw: ");
	                        double withdrawAmount = sc.nextDouble();
	                        account.withdraw(withdrawAmount);
	                        break;
	                    case 4:
	                        if (account == null) {
	                            throw new NullPointerException("No account found. Please create an account first.");
	                        }
	                        System.out.println("Your current balance is: $" + account.getBalance());
	                        break;
	                    case 5:
	                        System.out.println("Thank you for using the Bank Account Management System. Goodbye!");
	                        break;
	                    default:
	                        throw new IllegalArgumentException("InvalidChoiceException: Invalid choice. Please select a valid option.");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            } catch (NullPointerException e) {
	                System.out.println(e.getMessage());
	            } catch (Exception e) {
	                System.out.println("An unexpected error occurred: " + e.getMessage());
	                sc.next(); // Clear the scanner buffer
	            }
	        } while (choice != 5);
	        
	        sc.close();
	    }
	}

	public void withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		
	}

	public String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deposit(double depositAmount) {
		// TODO Auto-generated method stub
		
	}
}
