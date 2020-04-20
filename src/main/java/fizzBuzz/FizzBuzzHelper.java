package fizzBuzz;

public class FizzBuzzHelper {
	private int fizzCount = 0;
	private int buzzCount = 0;
	private int fizzBuzzCount = 0;
	private int integerCount = 0;
	private int luckyCount = 0;
	private String printString = "";
	
	public void updateFizzCount() {
		fizzCount++;
		printString += " fizz";
	}
	
	public void updateBuzzCount(){
		buzzCount++;
		printString += " buzz";
	}
	
	public void updateFizzBuzzCount() {
		fizzBuzzCount++;
		printString += " fizzbuzz";
	}
	
	public void updateIntegerCount(int value) {
		integerCount++;
		printString += " " + value;
	}
	
	public void updateLuckyCount() {
		luckyCount++;
		printString += " lucky";
	}
	
	public boolean containsThree(int initialValue){
		String value = Integer.toString(initialValue);
		String[] valueArray = value.split("");
		for(int currentIndex = 0; currentIndex < valueArray.length; currentIndex++){
			if(Integer.parseInt(valueArray[currentIndex]) == 3){
				return true;
			}
		}
		return false;
	}
	
	public void printResults() {
		System.out.println(printString);
		System.out.println("fizz: " + fizzCount);
		System.out.println("buzz: " + buzzCount);
		System.out.println("fizzbuzz: " + fizzBuzzCount);
		System.out.println("lucky: " + luckyCount);
		System.out.println("integer: " + integerCount);
	}
	
	public int getFizzCount() {
		return fizzCount;
	}
	
	public int getBuzzCount() {
		return buzzCount;
	}
	
	public int getFizzBuzzCount() {
		return fizzBuzzCount;
	}
	
	public int getLuckyCount() {
		return luckyCount;
	}
	
	public int getIntegerCount() {
		return integerCount;
	}
}
