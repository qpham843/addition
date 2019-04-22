import java.util.ArrayList;

public class Grid {
    int height;
    int width;
    Object[][] grid;

    Grid(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new Object[height][width];
    }

    public void place(DnDCharacter character, int x, int y) {
        this.grid[y][x] = character;
    }

    public void findChar(DnDCharacter character) {
    }
}
