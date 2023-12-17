import static java.lang.Thread.sleep;

public class Provider implements Runnable{
    private Monitor monitor;
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public void run(){
        try {
            while (true) {
                sleep(1000);
                monitor.provide();
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
