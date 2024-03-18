package lr2;

public class Example7 {
    public static class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Баланс недостаточен");
        }
    }

    public double getBalance() {
        return balance;
    }
}
    public interface BankAccountInterface {
        void createNewAccount();
        void performTransaction(double amount, boolean isDeposit);
        double getCurrentBalance();
    }
    public static class BankAccountImpl implements BankAccountInterface {
        private BankAccount bankAccount;

        public BankAccountImpl() {
            this.bankAccount = new BankAccount();
        }


        public void createNewAccount() {
            bankAccount = new BankAccount();
        }
        public void performTransaction(double amount, boolean isDeposit) {
            if (isDeposit) {
                bankAccount.deposit(amount);
            } else {
                bankAccount.withdraw(amount);
            }
        }

        public double getCurrentBalance() {
            return bankAccount.getBalance();
        }
    }
    public static class Main {
        public static void main(String[] args) {
            BankAccountInterface bankAccount = new BankAccountImpl();
            bankAccount.createNewAccount();
            bankAccount.performTransaction(1000, true);
            bankAccount.performTransaction(500, false);
            System.out.println("Текущий баланс：" + bankAccount.getCurrentBalance());
        }
    }

}
