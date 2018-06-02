package com.bharath.ws.soap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WsdlfirstwsApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void IDontKnowWhatImDoing() {
		CustomerOrdersWsImpl o = new CustomerOrdersWsImpl();
		o.init();
		assertEquals("1", o.currentId);
	}

}
