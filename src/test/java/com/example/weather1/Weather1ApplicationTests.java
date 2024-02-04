package com.example.weather1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Weather1ApplicationTests {

	@Test
	void equalTest(){
		assertEquals(1, 1);
	}

	@Test
	void nullTest(){
		assertNull(null);
	}

	@Test
	void trueTest(){
		assertTrue(1==1);
	}

}
