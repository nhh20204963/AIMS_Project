package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // get int from user
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; ++j) {
                System.out.print("*");
            }
            for (int j = 0; j < n - 1 - i; ++j) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}