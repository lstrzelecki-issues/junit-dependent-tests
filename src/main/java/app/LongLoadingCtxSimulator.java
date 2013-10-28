package app;

public class LongLoadingCtxSimulator {
    public static void simulateFor(int seconds) {
        try {
            Thread.currentThread().sleep(seconds + 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
