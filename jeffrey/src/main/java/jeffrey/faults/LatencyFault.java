package jeffrey.faults;

public class LatencyFault implements Fault {
    private long sleepDuration;

    public LatencyFault(long sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    @Override
    public void apply() {
        try {
            Thread.sleep(sleepDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
