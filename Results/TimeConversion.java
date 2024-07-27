import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeConversion {



    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here=

        String[] time = s.split(":");

        String hour = time[0];
        String minute = time[1];
        String second = time[2].substring(0, 2);
        String period = time[2].substring(2, 4);

        if (period.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
            }
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h += 12;
                hour = String.valueOf(h);
            }
        }


        return hour + ":" + minute + ":" + second;
    }


    public static void main(String[] args) throws IOException {
        long timeBefore = System.currentTimeMillis();

        List<String> arr = new ArrayList<>();

        arr.add("07:05:45PM");
        arr.add("12:00:00AM");
        arr.add("12:00:00PM");

        for(String s : arr) {
            System.out.println("Input: " + s);
            System.out.println("Output: " + timeConversion(s));
        }

        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println("elapsed: " + elapsed + " ms");


    }
}
