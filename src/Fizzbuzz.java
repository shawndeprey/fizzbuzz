public class Fizzbuzz {
	public void run()
	{
		for(int i = 0; i < 100; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println(Integer.toString(i + 1) + ": Fizz Buzz!");
			} else
			if(i % 5 == 0){
				System.out.println(Integer.toString(i + 1) + ": Fizz!");
			} else
			if(i % 3 == 0){
				System.out.println(Integer.toString(i + 1) + ": Buzz!");
			}
		}
	}
}
