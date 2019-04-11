import java.util.Scanner;

	public class EvenOdd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number for 'z':");
		
		int z = scan.nextInt();

		for(int k=1; k<=z; ++k) {
			
			if(k%2==0) {
			System.out.println(k-1);
			}
			
		}
	}
}
	