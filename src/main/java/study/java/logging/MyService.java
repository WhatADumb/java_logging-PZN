package study.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {
    private final static Logger log = LoggerFactory.getLogger(MyService.class);
    private MyRepository myRepository;

    public MyService(MyRepository repository) {
        this.myRepository = repository;
    }

    public void save(){
        log.info("Service saved");
        this.myRepository.save();
    }
}
