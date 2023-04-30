package com.kodilla.bank.homework;

public class CashMachine {
    private int[] desposits;
    private int[] withdrawals;
    public CashMachine() {
        this.desposits = new int[0];
        this.withdrawals = new int[0];
    }


    public int balance() {
        int sum = 0;
        for (int i = 0; i < this.desposits.length; i++) {
            sum += this.desposits[i];
        }
        for (int i = 0; i < this.withdrawals.length; i++) {
            sum += this.withdrawals[i];
        }
        return sum;
    }
    public int[] getDesposits() {
        return desposits;
    }
    public int getDepositCount() {
        return desposits.length;
    }
    public int[] getWithdrawals() {
        return withdrawals;
    }
    public int getWithdrawalCount() {
        return withdrawals.length;
    }
    public int getTransactionCount() {
        return getDepositCount() + getWithdrawalCount();
    }
    public void withdraw(int amount) {
        int count = this.withdrawals.length;
        int[] newTransactions = new int[count + 1];
        System.arraycopy(this.withdrawals, 0, newTransactions, 0, count);
        newTransactions[count] = -amount;
        this.withdrawals = newTransactions;
    }
    public void deposit(int amount) {
        int count = this.desposits.length;
        int[] newTransactions = new int[count + 1];
        System.arraycopy(this.desposits, 0, newTransactions, 0, count);
        newTransactions[count] = amount;
        this.desposits = newTransactions;
    }

    public double averageWithdrawalAmount() {
        int count = getWithdrawalCount();
        if (count == 0) {
            return  0;
        }
        int sum = 0;
        for (int i = 0; i < withdrawals.length; i++) {
            sum += (-withdrawals[i]);
        }
        return sum / count;
    }

    public double averageDepositAmount() {
        int count = getDepositCount();
        if (count == 0) {
            return  0;
        }
        int sum = 0;
        for (int i = 0; i < desposits.length; i++) {
            sum += desposits[i];
        }
        return sum / count;
    }
}

