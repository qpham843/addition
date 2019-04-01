public class BasicAdd {
    static int add(int ... args) {
        int total = 0;
        for (int i = 0; i < args.length; i += 1) {
            total += args[i];
        }
        return total;
    }
}