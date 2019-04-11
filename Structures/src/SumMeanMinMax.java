import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Imput a value for a:");
		int a = scan.nextInt();
		System.out.println("Imput a value for b:");
		int b = scan.nextInt();
		System.out.println("Imput a value for c:");
		int c = scan.nextInt();
		System.out.println();
		System.out.println("The Sum amount of a+b+c is:");
		System.out.println(a+b+c);
		System.out.println();
		System.out.println("The Average of a+b+c is:");
		System.out.println((double)(a+b+c)/3);
		System.out.println();
		System.out.println("The Max Value between a, b and c is:");
		if (a>=b && a>=c) {
		System.out.println(a);
		} else if (b>=a && b>=c) {
			System.out.println(b);
		} else if(c>=a && c>=b) {
			System.out.println(c);
		}
		if(a>b && a>c) {
			System.out.println("Maximum is represented by 'a' just!");
		} else if(a==b && a>c) {
			System.out.println("Maximum is represented by 'a' and 'b'");
		} else if(a>b && a==c) {
			System.out.println("Maximum is represneted by 'a' and 'c'");
		} if(b>a && b>c) {
			System.out.println("Maximum is represneted by 'b' just!");
		} else if (b>a && b==c) {
			System.out.println("Maximum is represented by 'b' and 'c'");
		} else if(c>a && c>b) {
			System.out.println("Maximum is represented by 'c' just!");
		} else if (a==b && a==c && b==c)
		System.out.println("ALL NUMBERS ARE EQUAL! ;) So is not it hard to say who is the Maximum right?");
		System.out.println();
		System.out.println("The Min Value between a, b and c is:");
		if(a<=b && a<=c) {
		System.out.println(a);
		} else if(b<=a && b<=c) {
			System.out.println(b);
		} else if(c<=a && c<=b) {
			System.out.println(c);
		}
		if(a<b && a<c) {
			System.out.println("Minimum is represented by 'a' just!");
		} else if(a==b && a<c) {
			System.out.println("Minimum is represented by 'a' and 'b'");
		} else if(a<b && a==c) {
			System.out.println("Minimum is represented by 'a' and 'c'");
		} else if (b<a && b<c) {
			System.out.println("Minimum is represented by 'b' just!");
		} else if(b<a && b==c) {
			System.out.println("Minimum is represented by 'b' and 'c'");
		} else if(c<a && c<b) {
			System.out.println("Minimum is represented by 'c' just!");
		} else if(a==b && a==c) {
			System.out.println("ALL NUMBERS ARE EQUAL! ;) So is not it hard to say who is the Minumum right?");
		}
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
