import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testPrintHelloWorld() {
        // Redirect the standard output to capture the printed text
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method we want to test
        Main.printHelloWorld();

        // Reset the standard output
        System.setOut(System.out);

        // Verify the printed output
        String printedText = outputStream.toString().trim();
        assertEquals("Hello World", printedText);
    }
}
