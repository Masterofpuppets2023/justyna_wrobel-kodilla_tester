package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroTotalBalance() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[1] = new CashMachine();
        Bank bank = new Bank(machines);
        assertEquals (0, bank.totalBalance());
    }
    @Test
    public void shouldHaveZeroWithdrawalCount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[1] = new CashMachine();
        Bank bank = new Bank(machines);
        assertEquals (0, bank.withdrawalCount());
    }
    @Test
    public void shouldHaveNonZeroWithdrawalCount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[0].deposit(1000);
        machines[0].withdraw(250);
        machines[0].withdraw(370);
        machines[1] = new CashMachine();
        machines[1].deposit(6000);
        machines[1].withdraw(100);
        machines[1].withdraw(200);
        machines[1].withdraw(300);
        Bank bank = new Bank(machines);
        assertEquals (5, bank.withdrawalCount());
    }
    @Test
    public void shouldHaveZeroDepositCount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[1] = new CashMachine();
        Bank bank = new Bank(machines);
        assertEquals (0, bank.depositCount());
    }
    @Test
    public void shouldHaveNonZeroDepositCount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[0].deposit(1000);
        machines[0].withdraw(250);
        machines[0].withdraw(370);
        machines[1] = new CashMachine();
        machines[1].deposit(6000);
        machines[1].withdraw(100);
        machines[1].withdraw(200);
        machines[1].withdraw(300);
        Bank bank = new Bank(machines);
        assertEquals (2, bank.depositCount());
    }
    @Test
    public void shouldHaveZeroAverageWithdrawalAmount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[1] = new CashMachine();
        Bank bank = new Bank(machines);
        assertEquals (0, bank.averageWithdrawalAmount());
    }
    @Test
    public void shouldHaveNonZeroAverageWithdrawalAmount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[0].deposit(1000);
        machines[0].withdraw(250);
        machines[0].withdraw(370);
        machines[1] = new CashMachine();
        machines[1].deposit(6000);
        machines[1].withdraw(100);
        machines[1].withdraw(200);
        machines[1].withdraw(300);
        Bank bank = new Bank(machines);
        assertEquals (244, bank.averageWithdrawalAmount());
    }
    @Test
    public void shouldHaveZeroAverageDepositAmount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[1] = new CashMachine();
        Bank bank = new Bank(machines);
        assertEquals (0, bank.averageWithdrawalAmount());
    }
    @Test
    public void shouldHaveNonZeroAverageDepositAmount() {
        CashMachine[] machines = new CashMachine[2];
        machines[0] = new CashMachine();
        machines[0].deposit(1000);
        machines[0].withdraw(250);
        machines[0].withdraw(370);
        machines[1] = new CashMachine();
        machines[1].deposit(6000);
        machines[1].withdraw(100);
        machines[1].withdraw(200);
        machines[1].withdraw(300);
        Bank bank = new Bank(machines);
        assertEquals (3500, bank.averageDepositAmount());
    }
}
