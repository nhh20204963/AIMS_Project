import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
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

        StringBuilder output = new StringBuilder();
        for (byte b : inputBytes) {
            output.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Read file in " + (endTime - startTime) + " ms");
    }
}