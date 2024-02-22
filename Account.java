public class Account{
    private final String accountNumber;
    private Double balance;
    private AccountState accountState;

    Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void deposit(Double amount){
        accountState.deposit(amount);
    }
    public void withdraw(Double amount){
        accountState.withdraw(amount);
    }
    public void suspend(){
        accountState.suspend();
    }
    public void activate(){
        accountState.activate();

    }
    public void close(){
        accountState.close();

    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void setAccountState(AccountState accountState){
        this.accountState = accountState;
    }
    public String toString(){
        return "Account number: " + accountNumber + ", Balance: " + balance;
    }
}