package digitalnomads;

public interface Bank {
    double getBalance();
    void deposit(double amount) throws Exception;// метод для пополнения счета
    void withDraw(double amount) throws Exception;// метод для вывода денег

    static void transferFunds(Bank sender, Bank recipient, double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }

}
