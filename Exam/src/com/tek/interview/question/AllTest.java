package com.tek.interview.question;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class AllTest {

	@Test
	public void testItem() {
		Item it = new Item("book", (float) 12.49);
		assertEquals("book", it.getDescription());		
	}
	
	@Test
	public void testOrderLine() throws Exception {
		OrderLine ol = new OrderLine(new Item("book", (float) 12.49), 1);
		assertEquals(1, ol.getQuantity());		
	}
	
	@Test
	public void testOrderClear() throws Exception {
		Order c = new Order();		
		c.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));
		c.clear();
		assertEquals(0,c.size());
		
	}

}
