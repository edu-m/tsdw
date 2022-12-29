/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmi.tsdw;

/**
 *
 * @author romae
 */
public class Account {
    private int balance;
    private String name;

    Account(String n, int b) {
        name = n;
        balance = b;
    }

    Account() {
        name = "undefined";
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int newBal) {
        balance = newBal;
    }

    public void addToBalance(int offset){
        setBalance(getBalance()+offset);
    }
}
