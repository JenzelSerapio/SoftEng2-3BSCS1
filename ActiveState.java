public class ActiveState implements AccountState{
private final Account account;

ActiveState(Account account){
    this.account = account;
}
public void deposit(Double amount){
    account.setBalance(account.getBalance() + amount);
    System.out.println("Deposited " + amount + ". Current balance: " + account.getBalance());
}
public void withdraw(Double amount){
    if(account.getBalance() >= amount){
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawn " + amount + ". Current balance: " + account.getBalance());
    } else{
        System.out.println("Insufficient Balance.");
    }
}
public void suspend(){
    account.setAccountState(new SuspendedState(account));
    System.out.println("Account is suspended!");
}
public void activate(){
    System.out.println("Account is already activated!");
}
public void close(){
    account.setAccountState(new ClosedState(account));
    System.out.println("Account is closed!");
}
}