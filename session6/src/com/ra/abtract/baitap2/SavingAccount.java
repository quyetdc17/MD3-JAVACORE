package com.ra.abtract.baitap2;

public class SavingAccount extends Account{
    double rate;
    int period;

    public SavingAccount(){

    }
    public SavingAccount(String accountNo, String customerName, double balance, double rate, int period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }

    public double getRate() {
        return rate;
    }


    public double getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public void checkInterest(){
        double m = this.balance*this.rate/100/12*this.period;
        System.out.println("get back balance money"+this.period +"is"+ m);
    }
    public void calculatorRate(int period){
        switch (period){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }
    }
}
