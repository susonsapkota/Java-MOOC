
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */

    public void advance() {

        if (this.day == 30) {
            this.month++;
            this.day = 1;

            if (this.month >= 12) {
                this.month = 1;
                this.year++;
            }
        } else {
            this.day++;
        }

    }

    public void advance(int numberOfDays) {
        int i = 1;
        while (numberOfDays >= i) {
            advance();
            i++;
        }
    }

    public MyDate afterNumberOfDays(int days) {

        MyDate newDate = new MyDate(day, month, year);
        newDate.advance(days);
        return newDate;

    }

    public int differenceInYears(MyDate comparedDate) {

        double diff = 0;

        if (this.year > comparedDate.year) {
            diff = (this.year + (double) this.month / 12 + (double) this.day / 365)
                    - (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365);
            return (int) diff;
        } else {
            diff = (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
            return (int) diff;
        }

    }

}
