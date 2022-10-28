package it.unical.Lab;

<<<<<<< HEAD
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithms2Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
=======
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithms2Test 
{
	private static FunnyAlgorithms2 fa;
	private static DateTime dt;
	
	@BeforeClass
	public static void prepareAll() {
		System.out.println("Inizio Test : "+dt.toDate());
		fa=new FunnyAlgorithms2();
		
	}
	@AfterClass
	public static void afterAll(){System.out.println("Fine Test : "+dt.toDate());}

    @Test
    public void stringToIntConverterWork() throws Exception
    {
    	assertEquals(1,fa.stringToIntConverter("1"));
    	assertEquals(10,fa.stringToIntConverter("10"));
    }
    @Test
    public void binarySearchWork()
    {
    	int[] nums= {3,4,9,1,8,4};
    	assertEquals(0,fa.binarySearch(nums,3));
    }
    
    @Test
    public void binarySearchNotWork()
    {
    	int[] nums= {3,4,9,1,8,4};
    	assertEquals(-1,fa.binarySearch(nums,10));
    }
    
  
    
    @Test
	public void selectionSortCrescenteWorks() {
		int[] array = {5,2,3,9,6};
		int[] order = {2,3,5,6,9};
		
		assertArrayEquals(order, fa.selectionSort(array, 1));
	}
    
    @Test
   	public void selectionSortCrescenteNotWorks() {
   		int[] array = {5,2,3,9,6};
   		int[] reverse= {9,6,5,3,2};
   		
   		assertArrayEquals(reverse, fa.selectionSort(array, 0));
   	}
       
    
>>>>>>> refs/heads/dev
}
