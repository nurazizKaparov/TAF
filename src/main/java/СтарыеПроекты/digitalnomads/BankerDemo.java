package СтарыеПроекты.digitalnomads;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank ataiDemirAccount = new DemirBank(123456789111l,111111111);
        System.out.println(ataiDemirAccount.getBalance());
        ataiDemirAccount.deposit(1000);
        System.out.println(ataiDemirAccount.getBalance());

        DemirBank nurazizDemirAccount = new DemirBank(111111111111l,222222222l);
        nurazizDemirAccount.deposit(2000);
        System.out.println(ataiDemirAccount.getBalance());

        Bank.transferFunds(nurazizDemirAccount,ataiDemirAccount,500);

        System.out.println(nurazizDemirAccount.getBalance());
        System.out.println(ataiDemirAccount.getBalance());

        KCIB pirganKCIBAccount = new KCIB(333333333333l,666666666l);
        Kyrgyzstan azamatKyrgyzstanAccount = new Kyrgyzstan(777777777777l,999999999l);
        pirganKCIBAccount.deposit(5000);
        Bank.transferFunds(nurazizDemirAccount,azamatKyrgyzstanAccount,123456);
        System.out.println(azamatKyrgyzstanAccount.getBalance());


    }
}
