import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GridTest {
    @Test
    public void twoGridsOfSize0AreEqual() {
        Grid grid1 = new Grid(0, 0);
        Grid grid2 = new Grid(0, 0);
        assertEquals(grid1, grid2);
    }

    @Test
    public void twoGridsOfSize1AreEqual() {
        Grid grid1 = new Grid(1, 1);
        Grid grid2 = new Grid(1, 1);
        assertEquals(grid1, grid2);
    }

    @Test
    public void twoGridsOfUnequalSizeAreNotEqual() {
        Grid grid1 = new Grid(1, 1);
        Grid grid2 = new Grid(2, 2);
        assertNotEquals(grid1, grid2);
    }

    @Test
    public void twoGridsOfSize1WithTheSameCharacterInsideAreEqual() {
        Grid grid1 = new Grid(1, 1);
        Grid grid2 = new Grid(1, 1);
        CharacterSheet randSheet = CharacterSheet.randomChar();
        DnDCharacter randChar = new DnDCharacter(randSheet);
        grid1.place(randChar, 0, 0);
        grid2.place(randChar, 0 , 0);
        assertEquals(grid1.get(0,0), grid2.get(0,0));
    }
}
