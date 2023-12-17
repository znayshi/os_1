public class Provider {
        private boolean ready = false;
        public synchronized void provide() {
            if (ready)
                return;
            ready = true;
            System.out.println("provided");
            notify();
        }

}
