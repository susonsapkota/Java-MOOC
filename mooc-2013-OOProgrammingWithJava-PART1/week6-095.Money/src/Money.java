
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(euros + added.euros(), cents + added.cents());
    }

    public Money minus(Money decremented) {

        double num = this.euros + (double) this.cents / 100;
        double num2 = decremented.euros + (double) decremented.cents / 100;
        double minus = num - num2;
        int a = 0;
        int b = 0;
        // there are cleaner ways to solve this like parsing difference to string and using split function.
        if (minus > 0) {
            a = (int) minus;
            b = (int) Math.round((minus - a) * 100); 
        }
        return new Money(a, b);
    }

    public boolean less(Money compared) {
        double unit = this.euros + (double) this.cents / 100;
        double comparedUnit = compared.euros + (double) compared.cents / 100;
        return unit < comparedUnit;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
