import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FindMedian {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        int n = sortedList.size();
        int median = sortedList.get(n / 2);

        System.out.println("Median: " + median);

        return median;

    }


    public static void main(String[] args) throws IOException {
        long timeBefore = System.currentTimeMillis();

        List<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);
        arr.add(4);

        System.out.printf("arr: %s%n", arr);
        System.out.println("Median: " + findMedian(arr));

        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println("elapsed: " + elapsed + " ms");


    }
}


