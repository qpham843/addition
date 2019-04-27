import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {
    @Test
    public void twoGridsOfSize0AreEqual() {
        Grid grid1 = new Grid(0, 0);
        Grid grid2 = new Grid(0, 0);
        assertEquals(grid1, grid2);
    }
}
