import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("What problem would you like to see?");
			String runProgram = "";
			runProgram = in.nextLine();
			switch(runProgram){
				case "fizzbuzz":{ Fizzbuzz project = new Fizzbuzz(); project.run(); break; }
				case "stringreverse":{ Stringreverse project = new Stringreverse(); project.run("asdfghjkl"); project.runWithoutTempVariable("asdfghjkl"); break; }
				case "exit":{ System.exit(0); break; }
				default:{ System.out.println("Could not find program " + runProgram + "."); break; }
			}
			System.out.println("Finished!");
		}
	}

}
