package euler;

public class Problem5 {
/*********************************************************************************
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*********************************************************************************/
	public void run()
	{
		int smallest = 20;
		boolean notFound = true;
		while(true){
			for(int i = 2; i <= 20; i++){
				if(smallest % i == 0){
					if(i == 20){ notFound = false; }
				} else {
					break;
				}
			}
			if(notFound){ smallest+=20; } else { break; }
		}
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+Integer.toString(smallest));
	}
}
