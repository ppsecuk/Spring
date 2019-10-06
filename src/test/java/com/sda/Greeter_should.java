package com.sda;

import com.sda.services.TranslationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Greeter_should {

    @Mock
    private TranslationService translationService;

    @InjectMocks
    private Greeter greeter;

    @Test
    public void invoke_translation_service(){

        greeter.setLanguage("es");

        doReturn("Hi", "Bye")
                .when(translationService)
                .translate(anyString(), anyString());

        final String hello = greeter.sayHello("Bob");
        assertThat(hello, is(equalTo("Hi, Bob!!!")));

        verify(translationService, times(1))
                .translate(anyString(), anyString());
    }
}