package edu.rit.swen352.tdd;






/**
 *
 *
 *My Bank
 *   <li>constructor: deafults account to 0$
 *   <li> depost: deposit money into an account. use a boolean to decide if it is savings or checking
 *   <li> withdraw: take money out of an account
 *   <li> Transfer: transfer money between accounts
 *   
 * </ul>
 *
 * @param <T> the type of elements in the stack.
 */

public class MyBank {
    private double checking;
    private double savings;

    public MyBank()  {
        this.checking = 0.0;
        this.savings = 0.0;

    }

    public double getBalance(boolean isSavings) {
        if (isSavings) {
            return savings;
        }
        return checking;
    }

    public void deposit(double amount, boolean isSavings) {
        if (isSavings) {
            this.savings += amount;
        }
        this.checking += amount;
    }

    public void withdraw(double amount, boolean isSavings) {
        if (isSavings) {
            this.savings -= amount;
        }
        this.checking -= amount;
    }
    
}
