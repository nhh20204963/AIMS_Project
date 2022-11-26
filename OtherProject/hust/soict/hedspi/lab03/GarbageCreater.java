import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreater {
    public static void main(String[] args) {
        // read input from file
        byte[] inputBytes = { 0 };
        try {
            inputBytes = Files.readAllBytes(Paths.get("input"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        String output = "";
        for (byte b : inputBytes) {
            output += b;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Read file in " + (endTime - startTime) + " ms");
    }
}