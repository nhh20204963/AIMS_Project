package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class Calculate {
    public static String title = "Calculate two Numbers";

    public static void main(String[] args) {
        String firstNumber, secondNumber;
        firstNumber = JOptionPane.showInputDialog(null, "Please enter first number: ", title,
                JOptionPane.INFORMATION_MESSAGE);
        secondNumber = JOptionPane.showInputDialog(null, "Please enter second number: ", title,
                JOptionPane.INFORMATION_MESSAGE);

        double sum = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        double difference = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
        double division = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
        double multiplication = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
        double remainder = Double.parseDouble(firstNumber) % Double.parseDouble(secondNumber);

        String message = "The sum is: " + sum + "\n" + "The difference is: " + difference + "\n" + "The division is: "
                + division + "\n" + "The multiplication is: " + multiplication + "\n" + "The remainder is: "
                + remainder;
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}