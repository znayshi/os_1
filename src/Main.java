public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Provider provider = new Provider();
        Consumer consumer = new Consumer();

        provider.setMonitor(monitor);
        consumer.setMonitor(monitor);

        Thread providerThread = new Thread(provider);
        Thread consumerThread = new Thread(consumer);

        providerThread.start();
        consumerThread.start();

        try {
            providerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
