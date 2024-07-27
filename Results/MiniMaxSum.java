import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MiniMaxSum {



    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here=

        int n = 0;
        List<Long> sum = new ArrayList<>();

        while (n < 5) {
            List<Long> arrCopy = new ArrayList<>(arr.stream().map(Long::valueOf).collect(Collectors.toList()));
//            int removedValue = arrCopy.get(n);
            arrCopy.remove(n);
            Long sumCopy = arrCopy.stream().reduce(Long.valueOf(0), Long::sum);


//            System.out.println("Sum every element except the " + removedValue + " element: " + arrCopy + " = " + sumCopy);
            sum.add(sumCopy);

            n++;
        }


        Long min = sum.stream().min(Long::compare).get();
        Long max = sum.stream().max(Long::compare).get();

        System.out.println((min) + " " + (max));

    }


    public static void main(String[] args) throws IOException {
        long timeBefore = System.currentTimeMillis();

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        miniMaxSum(arr);


        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println("elapsed: " + elapsed + " ms");


    }
}
