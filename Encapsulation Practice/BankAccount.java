public class BankAccount {
    /*Q3. Bank Account

Create a class BankAccount.

Private Variables:

accountNumber
holderName
balance

Methods:

getBalance()
deposit(double amount)
withdraw(double amount)

Condition:

Cannot withdraw more than balance.

Example:

Deposit: 5000
Withdraw: 2000

Balance = 3000 */


private long  accountNumber;
private String accountHolderName;
private double balance;

    public BankAccount(long accountNumber, String accountHolderName ,double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
  public void getAccountDetaills(){

    System.out.println("Account Detaills");
    System.out.println("============================");
    System.out.println("My AccountNumber : "+ accountNumber);
    System.out.println("My AccountHolder Name : "+ accountHolderName);
    System.out.println("My Account Balance : "+ balance);



  }

  public void depositAmount(double amount){
    System.out.println("============================");
          if(amount<0){
            System.out.println("Worng Amount");
          }
          else{
              balance +=amount;
              System.out.println("Amount is deposite : " + amount );
              System.out.println("Updated Amount : " + balance );

          }
  }

  public void withdrawAmount(double amount){

    System.out.println("============================");

          if(amount<0){
             System.out.println("Worng Amount");

          }
          else if(balance<amount){
            System.out.println("Cannot withdraw more than balance.");
           

                

          }
         else{
           balance -=amount;
            System.out.println("Withrowal succusefull :" +amount);
            System.out.println("Saving balance after withrol: "+ balance);
         }
  }

  










    





    
}
