
public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap :"+accountManager.getBalance()+ " TL");
        accountManager.deposit(100);
        System.out.println("Hesap :"+accountManager.getBalance()+ " TL");
        try {
            accountManager.withraw(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e);
        }
        System.out.println("Hesap :"+accountManager.getBalance()+ " TL");
        try {
            accountManager.withraw(20);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Hesap :"+accountManager.getBalance()+ " TL");

    }
}