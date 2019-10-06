package com.sda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:/beans.xml")
@TestPropertySource(properties = "translation.language=foo")
public class GreeterIntegrationTest {

    @Autowired
    private Greeter greeter;

    @Test
    public void test_greeting(){
        assertNotNull(greeter);

        assertThat(greeter.getLanguage(), is(equalTo("foo")));
    }

}