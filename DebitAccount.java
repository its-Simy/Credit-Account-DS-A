package org.example;

public class DebitAccount extends Account{

    DebitAccount(){
        super();
    }
    DebitAccount(double promo){
        setBalance(promo);
    }

    @Override
    public boolean deposit(double _amount) {
        if (_amount <= 0){
            System.out.println("Insufficient Deposit Amount");
            return false;
        }
        else{
            //will use the setbalance method, then call
            // the get balance to then add the extra amount you wish to deposit
            setBalance(getBalance() + _amount);
        }
        return true;
    }

    @Override
    public boolean withdrawl(double _amount) {
        if(_amount <= 0){
            System.out.println("Withdrawl amount must be positive or greater than 0");
            return false;
        }
        else{
            if(_amount > getBalance()){
                System.out.println("Insufficient funds in account");
                return false;
            }
            else{
                setBalance(getBalance() - _amount);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String content = "The current balance = " + getBalance() + "\n";
        return content;
    }
}
