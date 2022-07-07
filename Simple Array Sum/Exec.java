import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exec {
    public static void main(String[] args) throws IOException {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer value = arrayList.stream().reduce(0, Integer::sum);
        System.out.println(value);
    }
}
