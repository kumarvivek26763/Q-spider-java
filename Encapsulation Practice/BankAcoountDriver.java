public class BankAcoountDriver {
    public static void main(String[] args) {
        BankAccount ac=new BankAccount(40312554, "Vivek Kumar", 100000);
        BankAccount ac1=new BankAccount(4031255, "Deepak kumar", 50000);

        ac.getAccountDetaills();
        ac.depositAmount(45000);
        ac.withdrawAmount(8000);


          ac1.getAccountDetaills();
        ac1.depositAmount(45000);
        ac1.withdrawAmount(8000);



        System.out.println(ac1.accountNumber);
       
    

    }
}
