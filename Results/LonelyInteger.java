import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {
    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here

        // USO DO XOR PARA ENCONTRAR O NÚMERO QUE NÃO SE REPETE
        return a.stream().reduce(0, (acc, x) -> acc ^ x);

    }

    public static void main(String[] args) throws IOException {
        long timeBefore = System.currentTimeMillis();

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        int result = lonelyInteger(arr);

        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println("elapsed: " + elapsed + " ms");

    }
}
