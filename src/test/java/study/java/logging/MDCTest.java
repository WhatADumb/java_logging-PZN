package study.java.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MDCTest {
    @Test
    void testRequestWithoutMDC() {
        MyController controller = new MyController(new MyService(new MyRepository()));
        controller.save();
    }

    @Test
    void testRequestMDC() {
        MyController controller = new MyController(new MyService(new MyRepository()));

        MDC.put("requestId", UUID.randomUUID().toString());
        controller.save();
        MDC.remove("requestId");
    }

    @Test
    void testRequestMDCMultiThread() throws InterruptedException {
        MyController controller = new MyController(new MyService(new MyRepository()));

        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                MDC.put("requestId", UUID.randomUUID().toString());
                controller.save();
                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(2_000L);
    }
}
