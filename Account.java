package org.example;

public abstract class Account {

    //add balance and account
    private double balance;

    //the following is a default constructor
    public Account(){

        //will set balance to 0 by default
        this.balance = 500;

    }

    //the following is the parametric constructor
    public Account(double _balance){
        this.balance = _balance;
    }
    //the following is a copy constructor
    public Account(Account act){
        this.balance = act.balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double _balance){
        this.balance = _balance;
    }




    //add deposit function
    public abstract boolean deposit(double _amount);

    //add withdrawl function
    public abstract boolean withdrawl( double _amount);

}
