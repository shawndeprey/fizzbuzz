package euler;

public class Problem7 {
/*********************************************************************************
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*********************************************************************************/
	public void run()
	{
		int primes = 0;
		for(int i = 0; primes <= 10001; i++){
			if(this.isPrime(i)){
				primes++;
				if(primes == 10001){
					System.out.println("The 10001st prime number is "+Integer.toString(i));
					break;
				}
			}
		}
	}
	
	private boolean isPrime(int x){//Worst case scenario O(n/2) => O(n)
		if(x % 2 == 0){return false;}//Check all evens
		for(int i = 3; i < x/2; i+=2){//Check all odds
			if(x % i == 0){return false;}
		}
		return true;
	}
}
