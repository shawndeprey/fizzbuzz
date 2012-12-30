package euler;

public class Problem4 {
/*********************************************************************************
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*********************************************************************************/
	public void run()
	{
		int largest = 0;
		for(int x = 900; x < 1000; x++){
			for(int y = 900; y < 1000; y++){
				System.out.println(Integer.toString(x) + " | " + Integer.toString(y));
				if(this.isPalindrome(x * y)){
					largest = x * y;
				}
			}
		}
		System.out.println("The largest palindrome that is the product of two 3 digit numbers is "+Integer.toString(largest));
	}
	
	private boolean isPalindrome(int x)
	{
		String val = Integer.toString(x);
		String rev = new StringBuffer(val).reverse().toString();
		System.out.println(val + " | " + rev + " | " + val.equals(rev));
		return val.equals(rev);
	}
}
