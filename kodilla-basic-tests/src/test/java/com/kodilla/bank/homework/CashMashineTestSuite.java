package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {
    @Test
    public void shouldHaveZeroTransactions() {
        CashMachine machine = new CashMachine();
        int count = machine.getTransactionCount();
        assertEquals (0, count);
    }
    @Test
    public void shouldHaveThreeTransactions() {
        CashMachine machine = new CashMachine();
        machine.deposit(1000);
        machine.withdraw(100);
        machine.withdraw(80);

        int count = machine.getTransactionCount();
        assertEquals (3, count);
    }
    @Test
    public void shouldHaveTwoWithdrawals() {
        CashMachine machine = new CashMachine();
        machine.deposit(1000);
        machine.withdraw(100);
        machine.withdraw(80);

        int count = machine.getWithdrawalCount();
        assertEquals (2, count);
    }
    @Test
    public void shouldHaveOneDeposit() {
        CashMachine machine = new CashMachine();
        machine.deposit(1000);
        machine.withdraw(100);
        machine.withdraw(80);

        int count = machine.getDepositCount();
        assertEquals(1, count);
    }
    @Test
    public void shouldHaveZeroWithdrawals() {
        CashMachine machine = new CashMachine();
        machine.deposit(1000);
        machine.deposit(100);
        machine.deposit(80);

        int count = machine.getWithdrawalCount();
        assertEquals(0, count);
    }
    @Test
    public void shouldHaveCorrectAverageWithdrawalAmount() {
        CashMachine machine = new CashMachine();
        machine.deposit(6000);
        machine.withdraw(1000);
        machine.withdraw(100);
        machine.deposit(2000);
        machine.withdraw(400);

        double average = machine.averageWithdrawalAmount();
        assertEquals(500, average);
    }

    @Test
    public void shouldHaveCorrectAverageDepositAmount() {
        CashMachine machine = new CashMachine();
        machine.deposit(6000);
        machine.withdraw(1000);
        machine.withdraw(100);
        machine.deposit(2000);
        machine.withdraw(400);

        double average = machine.averageDepositAmount();
        assertEquals(4000, average);
    }
}
