package jeffrey;

import jeffrey.faults.Fault;

import java.util.List;
import java.util.function.Supplier;

public class Jeffrey {
    private List<Fault> faultList;

    public Jeffrey(List<Fault> faultList) {
        this.faultList = faultList;
    }

    public void jeffrey(Runnable runnable) {
        for (Fault f: faultList) {
            f.apply();
        }
        runnable.run();
    }

    public <T> T jeffrey(Supplier<T> supplier){
        for (Fault f: faultList) {
            f.apply();
        }
        return supplier.get();
    }
}
