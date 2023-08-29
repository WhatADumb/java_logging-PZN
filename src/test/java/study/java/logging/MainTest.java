package study.java.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
    private final static Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLogger() {
        log.info("Hello, World!");
    }
}
