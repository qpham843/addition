public class Division {
    static int divide(int x, int y) {
        if (y == 1) {
            return x;
        }
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return x/y;
    }
}
