public class Consumer {
        private boolean ready = false;
        public synchronized void consume() throws InterruptedException {
            while(!ready)
                wait();
            ready = false;
            System.out.println("consumed");
            notify();
        }

}
