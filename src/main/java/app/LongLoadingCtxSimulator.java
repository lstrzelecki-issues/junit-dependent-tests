package app;

public class LongLoadingCtxSimulator {
    public static void simulate(long millis) {
        try {
            Thread.currentThread().sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
