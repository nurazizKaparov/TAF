package СтарыеПроекты.digitalnomads;

public interface Bank {

    double getBalance();
    void deposit(double amount) throws Exception;
    void withDraw(double amount) throws Exception;

    static void transferFunds(Bank sender, Bank recipient,double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }

    static void transferFunds(Bank sender, KCIB recipient,double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }
    static void transferFunds(Bank sender, Kyrgyzstan recipient,double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }
}
