package studio1;

import java.util.Scanner;
import java.util.scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("yo put both of your numbers down");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		double avg = n1/2.0 + n2/2.0;
		System.out.println("Average of " +n1+ " and " +n2+ " is "+avg);
	}

}
