package it.unical.Lab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithms2Test 
{
	private static FunnyAlgorithms2 fa;
	
	@BeforeClass
	public static void prepareAll() {
		System.out.println("before class");
		fa=new FunnyAlgorithms2();
	}

    @Test
    public void stringToIntConverterWork() throws Exception
    {
    	assertEquals(1,fa.stringToIntConverter("1"));
    	assertEquals(10,fa.stringToIntConverter("10"));
    }
}
