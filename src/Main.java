import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Test().print();
    }
}
class Test {
    private Object object = new Object();

    public void print() throws InterruptedException {
        CompletableFuture.runAsync(() -> {
            synchronized (object) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1");
            }
        });

        synchronized (object) {
            System.out.println("2");
        }

        CompletableFuture.runAsync(() -> {
            synchronized (object) {
                System.out.println("3");
            }
        });
    }
}
