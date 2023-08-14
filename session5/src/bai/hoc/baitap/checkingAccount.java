package bai.hoc.baitap;

public class checkingAccount extends bankAccount{
    double amount;
    public checkingAccount(String owner, double balance,double amount) {
        super(owner, balance);
        this.amount= amount;
    }

    public void withDraw(double amount){}
    double fee;
}
