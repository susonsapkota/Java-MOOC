/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suson
 */
public class Bird {

    private String name;
    private String latinName;
    private int timesObserved;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.timesObserved = 0;
    }

    public Bird() {
        this.name = "";
        this.latinName = "";
        this.timesObserved = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getTimesObserved() {
        return timesObserved;
    }

    public void wasObserved() {
        this.timesObserved++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "):" + this.timesObserved + " observations";
    }

}
