package com.example.CICD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdApplicationTests {

	@Test
	void simpleTest() {
        int a = 95;
        int b = 5;
        assertEquals(100, a + b, "Addition test failed!");
    }

}
