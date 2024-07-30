import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDiference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int n = arr.size();
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for(int i = 0; i < n; i++) {
            List<Integer> row = arr.get(i);
            int m = row.size();

            for(int j = 0; j < m; j++){
                if(i == j){
                    System.out.println("to primaryDiagonal: " + row.get(j) + " at i: " + i + " j: " + j);
                    primaryDiagonal += row.get(j);
                }

                if(i + j == n - 1){
                    System.out.println("to secondaryDiagonal: " + row.get(j) + " at i: " + i + " j: " + j);
                    secondaryDiagonal += row.get(j);
                }

            }


        }

        System.out.println("primaryDiagonal: " + primaryDiagonal);
        System.out.println("secondaryDiagonal: " + secondaryDiagonal);

        return Math.abs(primaryDiagonal - secondaryDiagonal);

    }

    public static void main(String[] args) throws IOException {
        long timeBefore = System.currentTimeMillis();

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);



        int result = diagonalDifference(arr);

        System.out.println("Result: " + result);

        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println("elapsed: " + elapsed + " ms");
    }
}
