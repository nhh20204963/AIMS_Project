package hust.soict.hedspi.lab01;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = { 2002, 1241, 3, 1123, 42131, 1230, 52384, 123, 0, 5824 };
        Arrays.sort(arr);
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum: " + sum + "\nAverage: " + (double) sum / arr.length);

    }

}