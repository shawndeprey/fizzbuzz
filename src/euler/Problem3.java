package euler;

public class Problem3 {
/*********************************************************************************
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
*********************************************************************************/
	public void largestPrimeFactor(long x)
	{
		System.out.println("Trying to get the largest prime factor of "+Long.toString(x));
		long lpf = this.LPF(x);
		System.out.println("The largest prime factor of "+Long.toString(x)+" is "+Long.toString(lpf));
	}
	
	public long LPF(long x)
	{
		long upper = x, lower = 2;
		while(true){
			if(this.isPrime(lower)){
				if(upper % lower == 0){
					upper = upper / lower;
					if(this.isPrime(upper)){
						return upper;
					} else {
						return this.LPF(upper);
					}
				} else {
					lower++;
				}
			} else {
				lower++;
			}
		}
	}
	
	private boolean isPrime(long x)
	{
		if(x % 2 == 0){ return false; }
		for(int i = 3; i < x/2; i+=2){
			if(x % i == 0){ return false; }
		}
		return true;
	}
}
