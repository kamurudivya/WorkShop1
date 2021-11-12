package com.bridgelabz.workshop;

public class SavingAccount1 {
    public static class SavingsAccount{

        private static double annualInterestRate;
        private double savingsBalance;

        public SavingsAccount()
        {
            savingsBalance = 0;
            annualInterestRate = 0;
        }

        public SavingsAccount(double balance)
        {
            savingsBalance = balance;
            annualInterestRate = 0;
        }

        public void calculateMonthlyInterest()
        {
            System.out.println("Current savings balance: " + savingsBalance);
            double monthlyInterest;
            monthlyInterest = (savingsBalance * annualInterestRate)/12;
            savingsBalance = monthlyInterest;
            System.out.println("New savings balance: " + savingsBalance);
        }

        public double getBalance()
        {
            return savingsBalance;
        }
        public static void modifyInterestRate(double newInterestRate)
        {
            annualInterestRate = newInterestRate;
        }


        public static void main(String[] args)
        {
            SavingsAccount saver1 = new SavingsAccount(2000);
            SavingsAccount saver2 = new SavingsAccount(3000);
            SavingsAccount.modifyInterestRate(.04);
            saver1.calculateMonthlyInterest();
            SavingsAccount.modifyInterestRate(.04);
            saver2.calculateMonthlyInterest();
            SavingsAccount.modifyInterestRate(.05);
            saver1.calculateMonthlyInterest();
            SavingsAccount.modifyInterestRate(.05);
            saver2.calculateMonthlyInterest();
        }
    }
        }

