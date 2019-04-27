import java.util.ArrayList;
import java.util.Arrays;

public class Grid {
    int height;
    int width;
    Position[][] grid;

    Grid(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new Position[height][width];
    }

    public void place(DnDCharacter character, int x, int y) {
        this.grid[y][x] = new Position(x, y, character);
    }

    public Position get(int x, int y) {
        return this.grid[y][x];
    }

    public Position findChar(DnDCharacter character) {
        for (int i = 0; i < this.height; i += 1) {
            for (int j = 0; j < this.width; j += 1) {
                if (this.grid[i][j] != null && this.grid[i][j].inhabitant.equals(character)) {
                    return this.grid[i][j];
                }
            }
        }
        return null;
    }

    public static int distance(Position pos1, Position pos2) {
        int xdist = pos1.x - pos2.x;
        int ydist = pos1.y - pos2.y;
        return Math.abs(xdist) + Math.abs(ydist);
    }

    public int distance(DnDCharacter character, Position pos2) {
        Position pos1 = this.findChar(character);
        if (pos1 == null) {
            return -1;
        }
        int xdist = pos1.x - pos2.x;
        int ydist = pos1.y - pos2.y;
        return Math.abs(xdist) + Math.abs(ydist);
    }

    @Override
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
