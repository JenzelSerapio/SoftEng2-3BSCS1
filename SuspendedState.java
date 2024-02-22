public class SuspendedState implements AccountState{
    private final Account account;

    SuspendedState(Account account){
        this.account = account;
    }
    public void deposit(Double amount){
        System.out.println("You cannot deposit to a suspended account.");
    }
    public void withdraw(Double amount){
            System.out.println("You cannot withdraw to a suspended account.");
        }
    
    public void suspend(){
        System.out.println("Account is already suspended!");
    }
    public void activate(){
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated!");
    }
    public void close(){
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
    }
