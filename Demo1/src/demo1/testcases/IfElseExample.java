package demo1.testcases;
import java.util.Scanner;  


public class IfElseExample {
	public static void banana(int b) {

		if (b <= 40)
			System.out.println(" Give me one dozen bananas and half dozen apples ");
		else
			System.out.println(" Give me one dozen apples ");
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.print("Enter the bananas rate: ");
		int b = scan.nextInt();
		

		banana(b);

	}
}
