package com.springbootshirorestful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootShiroRestfulApplication.class)
public class SpringbootShiroRestfulApplicationTests {

    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() {
        System.out.println("运行中");
        System.out.println(myService.getStudent(1));
    }

}
