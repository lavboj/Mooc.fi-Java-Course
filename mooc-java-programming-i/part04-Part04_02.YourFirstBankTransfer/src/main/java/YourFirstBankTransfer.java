
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        matthewAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
