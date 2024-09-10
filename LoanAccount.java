package org.example;

public class LoanAccount extends Account{

    double interestRate;
    double amounttowardsInterest;
    double amounttowardsprinciple;
    double principle;
    double balance;


    public LoanAccount(){
        interestRate = 0.05;
        amounttowardsprinciple = 0;
        amounttowardsInterest = 0;
        principle = 0;
        balance = getBalance();

    }

    public LoanAccount(double _principle){
        //interest rate will be originally set to 5%
        interestRate = 0.05;
        amounttowardsprinciple = 0;
        amounttowardsInterest = 0;
        principle = _principle;


    }

    public LoanAccount(double _principle, double _interestRate){
        interestRate = _interestRate;
        amounttowardsprinciple = 0;
        amounttowardsInterest = 0;
        principle = _principle;
    }

    @Override
    public boolean deposit(double _amount) {
        //checks if there is any money owed at all to pay off
        if(principle == 0){
            System.out.println("There is no balance to pay off");
            return false;
        }
        else if (_amount > (principle + (principle * interestRate))){
            System.out.println("The amount being deposited is greater than what is owed");
            return false;
        }
        else if(_amount < 0){
            System.out.println("Must deposit a positive number");
            return false;
        }
        else{
            //holding the amount that is going to go to the interest
            double interestPayment = (_amount *.25);
            amounttowardsInterest += interestPayment;
            //takes away the amount that is going towards the interest
            _amount -= interestPayment;
            amounttowardsprinciple += _amount;

            principle -= _amount;
            System.out.println(toString());

        }

        return true;
    }

    @Override
    public boolean withdrawl(double _amount) {

        System.out.println("You cannot withdraw from a Loan Account");
        System.out.println();
        System.out.println(toString());




        return false;
    }


    @Override
    public String toString() {
        //will take the number and will multiply it by 100 in order to move the needed decimal points
        //then it will cast the double into a int, then recast it into a double and divide it by 100
        //this is to isolate the 2 decimal places needed for the cents and for it to stay consistent
        double total = principle;
        total *= 100;
        int newTotal = (int)total;
        double lasttotal = newTotal / 100.0;


        return "LoanAccount{" +
                " amount that has gone towards the Interest = " + amounttowardsInterest +
                ", amount that has gone towards the principle = " + amounttowardsprinciple +
                ", " + "Total principle still owed: " + (lasttotal) +
                '}';
    }
}
