package study.java.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.NoSuchFileException;

public class FormatTest {
    private static final Logger log = LoggerFactory.getLogger(FormatTest.class);

    @Test
    void testFormat() {
        log.info("This is Information");
        log.info("{} x {} = {}", 25, 4, (25 * 4));
        log.error("File Not Found(404)", new NoSuchFileException("sample.txt"));
    }
}
