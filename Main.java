import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        printHelloWorld();
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    @Test
    public void testPrintHelloWorld() {
        // Redirect the standard output to capture the printed text
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method we want to test
        printHelloWorld();

        // Reset the standard output
        System.setOut(System.out);

        // Verify the printed output
        String printedText = outputStream.toString().trim();
        assertEquals("Hello World", printedText);
    }
}
