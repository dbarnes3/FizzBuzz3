package fizzBuzz;

import org.joda.time.LocalTime;

public class FizzBuzz {
	private static FizzBuzzHelper helper = new FizzBuzzHelper();
	
	public static void main(String[] args) {
		helper = new FizzBuzzHelper();
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		for(int currentIndex = start; currentIndex < end + 1; currentIndex++){
			if(helper.containsThree(currentIndex)){
				helper.updateLuckyCount();
			}
			else if(currentIndex%15 == 0)
			{
				helper.updateFizzBuzzCount();
			}
			else if(currentIndex%5 == 0)
			{
				helper.updateBuzzCount();
			}
			else if(currentIndex%3 == 0)
			{
				helper.updateFizzCount();
			}
			else
			{
				helper.updateIntegerCount(currentIndex);
			}
		}
		helper.printResults();
    }
}
