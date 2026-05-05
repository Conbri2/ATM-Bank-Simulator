//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.atmbanksimulator;

public class SavingAccount extends BankAccount { // Creating Savings account with additional withdrawl rules.
    public SavingAccount(String var1, String var2, int var3) { /* Calls BankAccount constructor and passes account number,
     pin number, and balance details. */

        super(var1, var2, var3); //calls BankAccount constructor
    }
    @Override
    public boolean withdraw(int var1) { // Overrides withdraw method from BankAccount to add additional rules.

        return var1 > 300 ? false : super.withdraw(var1); /* If amount is greater than 300, it denies withdrawl, otherwise
        it uses the original method from Bank. */
    }
}
