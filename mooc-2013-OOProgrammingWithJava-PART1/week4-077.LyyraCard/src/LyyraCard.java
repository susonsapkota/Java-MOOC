/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suson
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if (this.balance - 2.50 >= 0) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance - 4 >= 0) {
            this.balance = this.balance - 4;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount > 0) {
            if (this.balance + amount >= 150) {
                this.balance = 150.0;
            } else {
                this.balance += amount;
            }
        }
    }

}
