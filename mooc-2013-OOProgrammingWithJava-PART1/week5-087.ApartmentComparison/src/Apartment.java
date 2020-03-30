
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = this.squareMeters * this.pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {

        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {

        int result = (this.price) - (otherApartment.price);
        if (result < 0) {
            return result * -1;
        } else {
            return result;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.price > otherApartment.price;
    }
}
