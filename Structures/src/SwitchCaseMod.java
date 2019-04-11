import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a value for a:");
		int a = scan.nextInt();
		
		System.out.println("Input a value for b:");
		int b = scan.nextInt();
		
		if (b<=0 || b>10) {
			
		System.out.println("You enter a wrong value for 'b' try it again, please.");
		
		}
			
				else {
					
					switch (a%b) {
		
						case 0:
						System.out.println("module is zero");							
						break;
						
						case 1:
							System.out.println("module is one");							
							break;
							
						case 2:
							System.out.println("module is two");							
							break;
							
						case 3:
							System.out.println("module is three");							
							break;
							
						case 4:
							System.out.println("module is four");							
							break;
							
						case 5:
							System.out.println("module is five");							
							break;
							
						case 6:
							System.out.println("module is six");							
							break;
							
						case 7:
							System.out.println("module is seven");							
							break;
							
						case 8:
							System.out.println("module is eight");							
							break;
							
						case 9:
							System.out.println("module is nine");							
							break;
				default : 		
				}
				
					
				}
		}
	}

// Z_5 {0, 1, 2, 3, 4}
// 0 % 5 = 0
// ...
// 5 % 5 = 0
// 6 % 5 = 1

// a / b = c and r
// 1 / 5 = 0 and rest r = 1 <- %


		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

