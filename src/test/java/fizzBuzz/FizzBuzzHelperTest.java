package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzHelperTest {
	private FizzBuzzHelper helper = new FizzBuzzHelper();

	@Test
	public void updateFizzCount() {
		int initialValue = helper.getFizzCount();
		helper.updateFizzCount();
		helper.updateFizzCount();
		helper.updateFizzBuzzCount();
		assertEquals(initialValue+2, helper.getFizzCount());
	}
	
	@Test
	public void updateBuzzCount() {
		int initialValue = helper.getBuzzCount();
		helper.updateBuzzCount();
		helper.updateFizzCount();
		helper.updateBuzzCount();
		helper.updateBuzzCount();
		assertEquals(initialValue+3, helper.getBuzzCount());
	}
	
	@Test
	public void updateFizzBuzzCount() {
		int initialValue = helper.getFizzBuzzCount();
		helper.updateFizzBuzzCount();
		helper.updateFizzCount();
		helper.updateIntegerCount(5);
		helper.updateLuckyCount();
		assertEquals(initialValue+1, helper.getFizzBuzzCount());
	}
	
	public void updateLuckyCount() {
		int initialValue = helper.getLuckyCount();
		helper.updateFizzCount();
		helper.updateLuckyCount();
		helper.updateLuckyCount();
		helper.updateLuckyCount();
		helper.updateIntegerCount(6);
		helper.updateLuckyCount();
		assertEquals(initialValue+4, helper.getLuckyCount());
	}
	
	@Test
	public void updateIntegerTest() {
		int initialValue = helper.getIntegerCount();
		helper.updateFizzCount();
		helper.updateIntegerCount(8);
		helper.updateIntegerCount(7);
		helper.updateFizzCount();
		assertEquals(initialValue+2, helper.getIntegerCount());
	}
	
	@Test
	public void printResults() {
		
	}
	
	@Test
	public void containsThreeTrue() {
		assertTrue(helper.containsThree(1325));
		assertTrue(helper.containsThree(13));
		assertTrue(helper.containsThree(3841));
		assertTrue(helper.containsThree(3123));
		assertTrue(helper.containsThree(3));
	}
	
	@Test
	public void containsThreeFalse() {
		assertFalse(helper.containsThree(5));
		assertFalse(helper.containsThree(58));
		assertFalse(helper.containsThree(124));
		assertFalse(helper.containsThree(77));
	}

}
