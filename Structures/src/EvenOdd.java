import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
		System.out.println("Please enter a number for 'x':");
		int x = scan.nextInt();
		int i = 1;
		
		System.out.println(i);
		
		while(i<x) {
		
			i=i+1;
			
			if (i%2==0) {
				System.out.println(i+1);
			}
			
		}
		
	}
	
}
