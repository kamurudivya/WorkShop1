package com.bridgelabz.workshop;
public class SavingAccount {

    private static float annualInterestRate;
    private float savingsBalance;
    private float newsavingsBalance;


    public SavingAccount(float balance)
    {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest()
    {
        System.out.println("Current savings balance: " + savingsBalance);
        float monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        System.out.println("Monthly Interest : " + monthlyInterest);
        newsavingsBalance = monthlyInterest+savingsBalance;
        System.out.println("New savings balance: " + newsavingsBalance);
    }

    public float getBalance() {
        savingsBalance = newsavingsBalance;
        return newsavingsBalance;
    }

    public static void modifyInterestRate(float newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }


    public static void main(String[] args)
    {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        SavingAccount.modifyInterestRate((float) .04);
        System.out.println(" CURRENT MONTH:");
        System.out.println(" Saver1 ");
        saver1.calculateMonthlyInterest();
        System.out.println(" Saver2 ");
        saver2.calculateMonthlyInterest();
        System.out.println(" NEXT MONTH:");
        saver1.getBalance();
        saver2.getBalance();
        SavingAccount.modifyInterestRate((float) .05);
        System.out.println(" Saver1 ");
        saver1.calculateMonthlyInterest();
        System.out.println(" Saver2 ");
        saver2.calculateMonthlyInterest();
    }
}