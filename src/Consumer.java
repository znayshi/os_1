import static java.lang.Thread.sleep;

public class Consumer implements Runnable{
    private Monitor monitor;
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }
    public void run(){
        try {
            while(true)
                monitor.consume();
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
