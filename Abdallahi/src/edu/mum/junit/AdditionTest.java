package edu.mum.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void addTest()
	{
		Addition a = new Addition() ;
		assertEquals(6 , a.add(2, 4)) ;
		assertEquals(5 , a.add(2, 3)) ;
		assertEquals(0 , a.add(2, 2)) ;
		assertEquals(9 , a.add(2, 7)) ;
		assertEquals(9 , a.add(2, 4)) ;
	}
	
	@Test
	public void addTesttest()
	{
	 List<Integer> l = new ArrayList<Integer>() ;
	 assertTrue(!l.isEmpty()) ;
	 
		
	}
}
