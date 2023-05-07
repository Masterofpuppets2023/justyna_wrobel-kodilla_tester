package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
                /*new CashMachine[3];
        CashMachine machine = new CashMachine();
        machine.deposit(1000);
        machine.withdraw(100);
        machine.withdraw(80);
        machine.withdraw(120);
        this.cashMachines[0] = machine;

        machine = new CashMachine();
        machine.deposit(5000);
        machine.withdraw(1000);
        machine.withdraw(600);
        this.cashMachines[1] = machine;

        machine = new CashMachine();
        machine.deposit(8000);
        machine.withdraw(3000);
        machine.withdraw(100);
        machine.withdraw(550);
        this.cashMachines[2] = machine;*/
    }

    public int totalBalance() {
        int balance = 0;
        for (int i=0; i < cashMachines.length; i++) {
            balance += cashMachines[i].balance();
        }
        return balance;
    }

    public int withdrawalCount() {
        int count = 0;
        for (int i=0; i < cashMachines.length; i++) {
            count += cashMachines[i].getWithdrawalCount();
        }
        return count;
    }

    public int depositCount() {
        int count = 0;
        for (int i=0; i < cashMachines.length; i++) {
            count += cashMachines[i].getDepositCount();
        }
        return count;
    }
    public double averageWithdrawalAmount() {
        if (cashMachines.length == 0) {
            return 0;
        }
        int amount = 0;
        int count = withdrawalCount();
        for (int i=0; i < cashMachines.length; i++) {
            int[] withdrawals = cashMachines[i].getWithdrawals();
            for (int j=0; j < withdrawals.length; j++) {
                amount += (-withdrawals[j]);
            }
        }
        if (count == 0) {
            return 0;
        }
        return amount/count;
    }

    public double averageDepositAmount() {
        if (cashMachines.length == 0) {
            return 0;
        }
        int amount = 0;
        int count = depositCount();
        for (int i=0; i < cashMachines.length; i++) {
            int[] deposits = cashMachines[i].getDesposits();
            for (int j=0; j < deposits.length; j++) {
                amount += deposits[j];
            }
        }
        if (count == 0) {
            return 0;
        }
        return amount/count;
    }
}
