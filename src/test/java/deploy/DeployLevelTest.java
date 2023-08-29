package deploy;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import study.java.logging.LevelTest;

public class DeployLevelTest {
    private final static Logger log = LoggerFactory.getLogger(DeployLevelTest.class);

    @Test
    void testLevels() {
        log.trace("Hello, Trace!");
        log.debug("Hello, Debug!");
        log.info("Hello, Info!");
        log.warn("Hello, Warn!");
        log.error("Hello, Error!");
    }
}
