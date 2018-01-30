package com.example.demo.property;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2018/1/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesTest.class);

    @Autowired
    private HomeProperties homeProperties;

    @Autowired
    private UserProperties userProperties;

    @Test
    public void getHomeProperties(){
        LOGGER.info("\n\n" + homeProperties,toString() + "\n");;
    }

    @Test
    public void getRandomTestUser(){
        LOGGER.info("\n\n" + userProperties,toString() + "\n");;
    }
}
