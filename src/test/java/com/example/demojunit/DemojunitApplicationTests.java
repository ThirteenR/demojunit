package com.example.demojunit;

import com.example.demojunit.services.Api;
import com.example.demojunit.services.TestB;
import com.example.demojunit.services.impl.Apij;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DemojunitApplicationTests {

    @Mock
    TestB testB;

    @InjectMocks
    Apij api;

    @Test
    void contextLoads() {
        when(testB.test()).thenReturn("123");
        String test = api.test();
        Assertions.assertSame("123", test);
    }

}
