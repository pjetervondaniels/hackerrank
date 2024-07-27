import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        Integer n = arr.size();
        AtomicReference<Integer> positive = new AtomicReference<>(0);
        AtomicReference<Integer> negative = new AtomicReference<>(0);
        AtomicReference<Integer> zero = new AtomicReference<>(0);

        arr.stream().forEach(a -> {
            if (a > 0) {
                positive.updateAndGet(v -> v + 1);
            } else if (a < 0) {
                negative.updateAndGet(v -> v + 1);
            } else {
                zero.updateAndGet(v -> v + 1);
            }
        });

        System.out.printf("%.6f%n", (double) positive.get() / n);
        System.out.printf("%.6f%n", (double) negative.get() / n);
        System.out.printf("%.6f%n", (double) zero.get() / n);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        System.out.printf("arr: %s%n", arr);
        Result.plusMinus(arr);

    }
}
