package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMain {
    public static void main(String[] args) {
        int nThreads = 5;
        ExecutorService executorService = null;
        Runnable runnable = () -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        try {
            executorService = Executors.newFixedThreadPool(nThreads);
            executorService.execute(runnable);
            executorService.execute(runnable);
            executorService.execute(runnable);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
