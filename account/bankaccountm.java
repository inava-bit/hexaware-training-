package account;


  // BankAccount class to represent the account
  class bankaccountm {
      private double balance;

      // Constructor to initialize account with balance
      public bankaccountm() {
          this.balance = 0.0;
      }

      // Method to deposit money into the account
      public void deposit(double amount) {
          if (amount <= 0) {
              throw new IllegalArgumentException("InvalidAmountException: Amount must be greater than 0.");
          }
          balance += amount;
          System.out.println("Successfully deposited: $" + amount);
      }

      // Method to withdraw money from the account
      public void withdraw(double amount) {
          if (amount <= 0) {
              throw new IllegalArgumentException("InvalidAmountException: Amount must be greater than 0.");
          }
          if (amount > balance) {
              throw new IllegalArgumentException("InsufficientFundsException: You do not have enough balance.");
          }
          balance -= amount;
          System.out.println("Successfully withdrew: $" + amount);
      }

      // Method to get the balance
      public double getBalance() {
          return balance;
      }
  }
