package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        DebitAccount dbt1 = new DebitAccount();
        //this one is the one with the promo
        DebitAccount dbt2 = new DebitAccount(25);
        System.out.println(dbt2);
        dbt2.deposit(100);
        System.out.println( dbt2.toString());
        dbt2.withdrawl(25);

        System.out.println( dbt2.toString());

        CreditAccount cr1 = new CreditAccount(100, 50);

        System.out.println("after initial instantiation of money for credit account: " + cr1.toString() );
        System.out.println();

        cr1.withdrawl(20);
        System.out.println("The following is the display after using the withdrawl function: " + cr1.toString());

        System.out.println();
        cr1.deposit(30);
        System.out.println("The following is afer using the deposit function: " + cr1.toString());

        System.out.println();
        */
        LoanAccount lc1 = new LoanAccount(10,.1);

        lc1.deposit(5);










    }
}