/**
 * Created by Jan on 29.04.2016.
 */
public interface Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
}
