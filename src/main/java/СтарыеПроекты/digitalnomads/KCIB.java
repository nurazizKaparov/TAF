package СтарыеПроекты.digitalnomads;

public class KCIB extends BankBase {

    private double balance;

    public KCIB(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0 || amount > 20000){
            throw new Exception("Invalid amount, can not be deposited ");
        }else {
            balance+=amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount < 0 || amount > 5000){
            throw new Exception("Invalid amount, can not be withdrawn");
        }else {
            if(balance<amount){
                throw new Exception("Insufficient funds");
            }else {
                balance-=amount;
            }
        }
    }
}
