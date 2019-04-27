import java.util.ArrayList;
import java.util.Arrays;

public class Grid {
    int height;
    int width;
    Object[][] grid;

    Grid(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new Position[height][width];
    }

    public void place(DnDCharacter character, int x, int y) {
        this.grid[y][x] = new Position(x, y, character);
    }

    public Position findChar(DnDCharacter character) {
        for (int i = 0; i < this.height; i += 1) {
            for (int j = 0; j < this.width; j += 1) {
                if (this.grid[i][j].equals(character)) {
                    return new Position(j, i);
                }
            }
        }
        return null;
    }

    public int distance(Position pos1, Position pos2) {
        int xdist = pos1.x - pos2.x;
        int ydist = pos1.y - pos2.y;
        return Math.abs(xdist) + Math.abs(ydist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Grid)) {
            return false;
        }

        Grid otherGrid = (Grid) other;
        return this.height == otherGrid.height && this.width == otherGrid.width && Arrays.deepEquals(this.grid, otherGrid.grid);
    }
}
