import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Exec {
    public static void main(String[] args) {
        List<Long> arrayList = new ArrayList<>();
        arrayList.add(1L);
        arrayList.add(2L);
        arrayList.add(3L);

        AtomicLong sum = new AtomicLong(0);

        arrayList.forEach(a -> {
            sum.addAndGet(a);
        });

        System.out.println(sum.longValue());
    }
}
