public class PositiveAdd {
    static int add(int ... args) {
        int total = 0;
        for (int i = 0; i < args.length; i += 1) {
            if (args[i] < 0) {
                throw new IllegalArgumentException("Illegal argument: " + args[i]);
            }
            total += args[i];
        }
        return total;
    }
}