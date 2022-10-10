package digitalnomads;

public class DemirBank extends BankBase{
    private double balance=200;

    public DemirBank(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount<0||amount>200000){
          throw new Exception("Invalid amount,can not be deposit");
        }else{
            balance+=amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if(amount<0||amount>5000){
            throw new Exception("Invalid amount,can not be withdrown/111");
        } else{
            if (balance<amount){
                throw new Exception("Недостаточно средств-Insufficient funds");
            }
            else{
                balance-=amount;
            }
        }

    }
}
