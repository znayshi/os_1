public class Monitor {
    private boolean ready;
    public synchronized void provide(){
        if (ready)
            return;
        ready = true;
        System.out.println("provided");
        notify();
    }
    public synchronized void consume() throws InterruptedException {
        while(!ready)
            wait();
        ready = false;
        System.out.println("consumed\n");
    }
}
