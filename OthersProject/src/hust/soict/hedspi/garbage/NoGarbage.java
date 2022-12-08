package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
    public static void main(String[] args) {
        // read input from file
        byte[] inputBytes = { 0 };
        String filename = "D:\\HUST\\20221\\Java + OOP\\OOP HUST\\LAB\\Code Demo Lab\\OthersProject\\src\\hust\\soict\\hedspi\\garbage\\input1";
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        StringBuilder output = new StringBuilder();
        for (byte b : inputBytes) {
            output.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Read file in " + (endTime - startTime) + " ms");
    }
}
