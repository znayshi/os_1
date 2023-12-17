public class Monitor {
    private boolean ready = false;
    private Provider provider = new Provider();
    private Consumer consumer = new Consumer();

    public void run() {
        Thread providerThread = new Thread(this::providerTask);
        Thread consumerThread = new Thread(this::consumerTask);

        providerThread.start();
        consumerThread.start();
    }

    private void providerTask() {
        try {
            while (true) {
                provider.provide();
                Thread.sleep(1000); // Задержка в одну секунду
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consumerTask() {
        try {
            while (true) {
                consumer.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
