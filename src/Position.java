public class Position {
    //Understands a location in a grid.
    int x;
    int y;
    Object inhabitant = null;
    boolean occupied = false;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Position(int x, int y, Object inhabitant) {
        this.x = x;
        this.y = y;
        this.inhabitant = inhabitant;
        this.occupied = true;
    }

    public boolean place(int x, int y, Object inhabitant) {
        if (this.occupied == true) {
            return false;
        } else {
            this.inhabitant = inhabitant;
            this.occupied = true;
            return true;
        }
    }
}
