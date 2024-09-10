package org.example;

public class CreditAccount extends Account{

    private double creditLimit;
    private double balance;
    CreditAccount(){
        balance = 0;
        creditLimit = 50.0;
    }
    //set credit limit

    public CreditAccount(double _creditLimit){
        creditLimit = _creditLimit;
    }
    public CreditAccount(double _creditLimit, double _balance){

        creditLimit = _creditLimit;
        setBalance(_balance);
        balance = getBalance();

    }
    //create a new class called loan account

    //Implementation for the Credit Deposit
    @Override
    public boolean deposit(double _amount) {

        //checks to see if the amount deposited is greater than the creditlimit
        double creditlimitbeforechange = creditLimit;
        if ( _amount > creditLimit || (_amount + creditLimit) > creditlimitbeforechange){
            System.out.println("Too much money is being deposited, try again");
            return false;
        }
        else if (_amount < 0) {
            System.out.println("Please input a positive number");
            return false;
        }
        else if (_amount > balance) {
            System.out.println("Insufficient Funds");
            return false;
        }
        else {
            creditLimit += _amount;
            balance -= _amount;
        }

        return true;
    }

    //Implementation for the credit withdrawl
    @Override
    public boolean withdrawl(double _amount) {

        if(_amount > creditLimit){
            System.out.println("The amount you are trying to withdrawl is greater than your credit limit");
            return false;
        }
        else if( _amount < 0){
            System.out.println("Input a positive number");
            return false;
        }
        else
            creditLimit -=_amount;
            setBalance(getBalance()+ _amount);
            balance = getBalance();

        return true;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "creditLimit = " + creditLimit +
                ", balance = " + balance +
                '}';
    }
}


