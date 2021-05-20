public class Syncronizer {
    private  Names s;
    private volatile int currIndex ;
    private volatile boolean isElSet ;
    private final Object locker;
    private boolean set;


    public Syncronizer(Names s) {
        this.s = s;
        this.currIndex=0;
        locker=new Object();
        isElSet=false;
    }
    public void writeToConsole(int val)
            throws ObjectException {
        synchronized(locker) {
            if (!canWrite())
            {
                throw new ObjectException();
            }
            while (set)
                locker.wait();
            s.setNames(current, val);
            System.out.println("Write: " + val);
            set = true;
            locker.notifyAll();
        }
    }
    public int readFromConsole() throws ObjectException {
        int value;
        synchronized(locker) {
            if (!canRead())
                throw new ObjectException();
            while (!set)
            {
                locker.wait();
            }
            value = s.getNames()[currIndex++];
            System.out.println("Read: " + value);
            set = false;
            locker.notifyAll();
        }
        return value;
    }

    private boolean canWrite() {
        return (!isElSet && currIndex < s.getNumOfEls() || (isElSet && currIndex < s.getNumOfEls() - 1));
    }

    void read() throws InterruptedException {
        int val;
        synchronized (s) {
            if (!canRead()) {
                throw new InterruptedException();
            }
            while (!isElSet) {
                s.wait();
            }

            val = s.getNames(currIndex);
            isElSet = false;
            System.out.println("READ  " + val + " from position " + currIndex);
            currIndex++;

            s.notifyAll();
        }
    }

    private boolean canRead() {
        return currIndex < s.getNames();
    }

    int getCountNames() {
        return s.getNames();
    }
}
