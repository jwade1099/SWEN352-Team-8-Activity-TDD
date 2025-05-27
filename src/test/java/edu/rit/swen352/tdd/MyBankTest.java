package edu.rit.swen352.tdd;


import edu.rit.swen352.tdd.MyBank;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@link MyStack} component.
 */



public class MyBankTest {


    @Test
    void testConstructor(){
        MyBank bank = new MyBank();
        
    }

    @Test
    void testDepositAndCheck() {
        MyBank bank = new MyBank();
        bank.deposit(50.50, false);
        assertEquals(50.50, bank.getBalance(false));
    }

    @Test
    void testWithdraw() {
        MyBank bank = new MyBank();
        bank.deposit(100.0, false);
        assertEquals(100.0, bank.getBalance(false));
        bank.withdraw(40.0, false);
        assertEquals(60.0, bank.getBalance(false));
    }


}
