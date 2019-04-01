import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DivisionTest {
    @Test
    public void oneDividedByOneIsOne() {
        assertEquals(1, Division.divide(1,1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void aZeroDivisorIsAnIllegalArgument() {
        Division.divide(2, 0);
    }
}
