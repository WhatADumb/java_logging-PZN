package study.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyController {
    private final static Logger log = LoggerFactory.getLogger(MyController.class);
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void save(){
        log.info("Controller saved");
        this.myService.save();
    }
}
