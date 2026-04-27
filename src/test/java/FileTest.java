import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileTest {

  @Test
  void testFileExists() {
    String path = "src\\test\\resources\\data.txt"; // BAD: Windows-only path

    assertTrue(Files.exists(Paths.get(path)));
  }
}