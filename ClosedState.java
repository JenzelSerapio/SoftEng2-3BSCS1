public class ClosedState implements AccountState{
    ClosedState(Account account){
    }
    public void deposit(Double amount){
        System.out.println("You cannot deposit to a closed account.");
    }
    public void withdraw(Double amount){
            System.out.println("You cannot withdraw from a closed account.");
        }
    
    public void suspend(){
        System.out.println("You cannot suspend a closed account.");
    }
    public void activate(){
        System.out.println("You cannot activate a closed account.");
    }
    public void close(){
        System.out.println("Account is already closed!");
    }
}
