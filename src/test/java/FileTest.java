import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileTest {

  @Test
  void testFileExists() {
    Path path = Paths.get("src", "test", "resources", "data.txt");

    assertTrue(Files.exists(path));
  }
}