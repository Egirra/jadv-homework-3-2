import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static final int PAUSE = 1000;

    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();

        Thread shop0 = new Shop("First shop", longAdder);
        Thread shop1 = new Shop("Second shop", longAdder);
        Thread shop2 = new Shop("Third shop", longAdder);

        shop0.start();
        shop1.start();
        shop2.start();
        try {
            Thread.sleep(PAUSE);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Сумма выручки: " + longAdder.sum());
    }
}
