package com.garfieldwiki.springboot;

import com.garfieldwiki.springboot.config.FooProperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMain {

    @Autowired
    private FooProperties fooProperties;

    @Test
    public void test() {
        System.out.println("Foo:---" + fooProperties.getHello());
    }

}
