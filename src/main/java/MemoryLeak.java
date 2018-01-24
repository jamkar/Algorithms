import java.util.HashMap;
import java.util.Map;

public class MemoryLeak {

    private Map<Integer, Integer> cache = new HashMap<>();

    private int square(int i) {
        int result = i * i;
        cache.put(i, result);
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        MemoryLeak ml = new MemoryLeak();

        int i = 0;
        while (true) {
            ml.square(i++);
            Thread.sleep(1);
        }
    }
}
