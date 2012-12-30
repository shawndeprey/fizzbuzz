import java.util.Scanner;
import euler.*;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("What problem would you like to see?");
			String runProgram = "";
			runProgram = in.nextLine();
			switch(runProgram){
			
/************************************************************************************/
/***Projects*************************************************************************/
/************************************************************************************/
case "fizzbuzz":{ Fizzbuzz project = new Fizzbuzz(); project.run(); break; }
case "stringreverse":{ Stringreverse project = new Stringreverse(); project.run("asdfghjkl"); project.runWithoutTempVariable("asdfghjkl"); break; }
/************************************************************************************/
/***Project Euler Projects***********************************************************/
/************************************************************************************/
case "euler1":{ Problem1 project = new Problem1(); project.run(); break; }
case "euler2":{ Problem2 project = new Problem2(); project.run(); break; }
case "euler3":{ Problem3 project = new Problem3(); project.largestPrimeFactor(600851475143L); break; }
case "euler4":{ Problem4 project = new Problem4(); project.run(); break; }
case "euler5":{ Problem5 project = new Problem5(); project.run(); break; }
case "euler6":{ Problem6 project = new Problem6(); project.run(); break; }
/************************************************************************************/
/***End Projects*********************************************************************/
/************************************************************************************/

				case "exit":{ System.exit(0); break; }
				default:{ System.out.println("Could not find program " + runProgram + "."); break; }
			}
			System.out.println("Finished!");
		}
	}

}
