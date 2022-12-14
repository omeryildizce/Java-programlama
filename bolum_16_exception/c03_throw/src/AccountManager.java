public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance += amount;
    }
    public void withraw(double amount) throws BalanceInsufficentException {
        if (balance>= amount) {
            balance -= amount;
        }
        else {
            throw new BalanceInsufficentException("Yetersiz bakiye");
        }
    }

    public double getBalance() {
        return balance;
    }
}
