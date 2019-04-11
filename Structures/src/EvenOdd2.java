import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number for 'y':");
		
		int y = scan.nextInt();
		int i = 1;
		
		while(i<=y) {
			
			i=i+1;
			
			if (i%2==0) {
				System.out.println(i-1);
				
			}
		}
	}

}
