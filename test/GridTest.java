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
        assertEquals(grid1, grid2);
    }

    @Test
    public void findCharacterAtPosition00WillReturnPosition00() {
        Grid grid1 = new Grid(1, 1);
        CharacterSheet randSheet = CharacterSheet.randomChar();
        DnDCharacter randChar = new DnDCharacter(randSheet);
        grid1.place(randChar, 0, 0);
        Position pos = new Position(0, 0 , randChar);
        assertEquals(pos, grid1.findChar(randChar));
    }

    @Test
    public void distanceBetween00and00Is0() {
        Position pos1 = new Position(0, 0);
        Position pos2 = new Position(0, 0);
        assertEquals(0, Grid.distance(pos1, pos2));
    }

    @Test
    public void distanceBetween00and11Is2() {
        Position pos1 = new Position(0, 0);
        Position pos2 = new Position(1, 1);
        assertEquals(2, Grid.distance(pos1, pos2));
    }

    @Test
    public void distanceBetweenACharacterAt00and11Is2() {
        Grid grid1 = new Grid(2, 2);
        CharacterSheet randSheet = CharacterSheet.randomChar();
        DnDCharacter randChar = new DnDCharacter(randSheet);
        grid1.place(randChar, 0, 0);
        Position pos2 = new Position(1, 1);
        assertEquals(2, grid1.distance(randChar, pos2));
    }
}
