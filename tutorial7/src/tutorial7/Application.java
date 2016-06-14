package tutorial7;

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		//output the prompt
		System.out.println("Enter in a line of text: ");
		//wait for the userto enter a line of text
		String line = input.nextLine();
		
		System.out.println("You entered in:" + line);
	}

}
