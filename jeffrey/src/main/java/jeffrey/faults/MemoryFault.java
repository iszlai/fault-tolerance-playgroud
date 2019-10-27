package jeffrey.faults;

import java.util.LinkedList;
import java.util.List;

public class MemoryFault implements Fault {
    public static List<Long[]> memoryData = new LinkedList<>();

    @Override
    public void apply() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Consuming ram");
                    memoryData.add(memory());
                }
            }
        }).start();
    }

    public static Long[] memory() {
        Long[] x = new Long[255];
        for (int i = 0; i < 255; i++) {
            x[i] = 1L;
        }
        return x;
    }
}
