/**
 * Created by Jan on 29.04.2016.
 */
public class NewReleasePrice implements Price {
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }
    public double getCharge(int daysRented){
        return daysRented * 3;
    }
}
