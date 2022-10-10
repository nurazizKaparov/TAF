package digitalnomads;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank ataiDemirAccount = new DemirBank(123456789112l, 111111111l);

        ataiDemirAccount.deposit(2000);
        System.out.println(ataiDemirAccount.getBalance());
        DemirBank nurazizDemirAccount = new DemirBank(222222222222l,222222222l);
        nurazizDemirAccount.deposit(3000);
        System.out.println(nurazizDemirAccount.getBalance());



        KCBBank nargizaKICBAccount = new KCBBank(333333333333l,333333333l);
        nargizaKICBAccount.deposit(500);
        System.out.println(nargizaKICBAccount.getBalance());

        Bank.transferFunds(ataiDemirAccount,nargizaKICBAccount,200);
        System.out.println(nargizaKICBAccount.getBalance());

    }
}
