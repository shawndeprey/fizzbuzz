package euler;

public class Problem6 {
/*********************************************************************************
The sum of the squares of the first ten natural numbers is: 12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is: (1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*********************************************************************************/
	public void run()
	{
		int sumOfSquare = 0, squareOfSum = 0;
		for(int i = 1; i <= 100; i++){
			sumOfSquare += (i * i);
			squareOfSum += i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		int diff = squareOfSum - sumOfSquare;
		System.out.println("Sum of the squares and the square of the sums of the first 100 natural numbers is "+Integer.toString(diff));
	}
}
