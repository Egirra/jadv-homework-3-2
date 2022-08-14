import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread {
    private final int CHECKS = 10;
    private final int MAX_EARNING = 10_000;
    private final Random random = new Random();
    LongAdder longAdder = new LongAdder();

    public Shop(String name, LongAdder longAdder) {
        super(name);
        this.longAdder = longAdder;
    }

    @Override
    public void run() {
        try {
            int earnings[] = new int[CHECKS];
            for (int i = 0; i < earnings.length; i++) {
                earnings[i] = random.nextInt(MAX_EARNING);
                longAdder.add(earnings[i]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
