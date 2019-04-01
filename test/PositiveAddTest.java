import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PositiveAddTest {
    @Test
    public void onePlusoneIsTwo() {
        assertEquals(2, PositiveAdd.add(1, 1));
    }
    @Test
    public void onePlustwoIsThree() {
        assertEquals(3, PositiveAdd.add(1, 2));
    }
    @Test
    public void twentyThreePlusFortyTwoIsSixtyFive() {
        assertEquals(65, PositiveAdd.add(23, 42));
    }
    @Test
    public void zeroPlusoneIsOne() {
        assertEquals(1, PositiveAdd.add(0, 1));
    }
    @Test
    public void onePlusonePlusoneIsThree() {
        assertEquals(3, PositiveAdd.add(1, 1, 1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void aNegativeNumberisAnIllegalArgument() {
        PositiveAdd.add(0, -1);
    }
}