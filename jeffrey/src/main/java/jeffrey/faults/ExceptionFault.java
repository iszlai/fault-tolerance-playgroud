package jeffrey.faults;

public class ExceptionFault implements Fault {

    @Override
    public void apply() {
        throw new RuntimeException("Jeffrey triggered");
    }
}
