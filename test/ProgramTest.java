import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Jan on 29.04.2016.
 */
public class ProgramTest {
    @org.junit.Test
    public void main() throws Exception {
        Movie m1 = new Movie("film1", 1);
        assertThat(m1.getTitle(), is("film1"));
        assertThat(m1.getPriceCode(), is(1));

        Movie m2 = new Movie("film2", 2);
        assertThat(m2.getTitle(), is("film2"));
        assertThat(m2.getPriceCode(), is(2));

        Rental r1 = new Rental(m1, 10);
        assertThat(r1.getMovie(), equalTo(m1));
        assertThat(r1.getDaysRented(), is(10));

        Rental r2 = new Rental(m2, 5);
        assertThat(r2.getMovie(), equalTo(m2));
        assertThat(r2.getDaysRented(), is(5));

        Customer c1 = new Customer("alex");
        assertThat(c1.getName(), is("alex"));
        c1.addRental(r1);   c1.addRental(r2);
        String str= "Rental Record for alex\n";
        str+="\tTitle\t\tDays\tAmount\n";
        str+="\tfilm1\t\t10\t30.0\n";
        str+="\tfilm2\t\t5\t4.5\n";
        str+="Amount owed is 34.5\n";
        str+="You earned 3 frequent renter points";

        assertThat(c1.statement(),is (str));
    }

}