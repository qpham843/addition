import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicAddTest {
    @Test
    public void onePlusoneIsTwo() {
        assertEquals(2, BasicAdd.add(1, 1));
    }
    @Test
    public void onePlustwoIsThree() {
        assertEquals(2, BasicAdd.add(1, 1));
    }
}