package com.example.learnkarate;

import com.intuit.karate.junit5.Karate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldControllerTests {

    @Karate.Test
    Karate testTest() {
        return Karate.run("helloWorld").relativeTo(getClass());
    }

}
