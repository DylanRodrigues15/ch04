/**
 * @author dylanrodrigues
 * Takes low input and high input from user
 * Prints out all integers between low and high input
 */

import java.util.Scanner;
public class rangePrint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int l = in.nextInt();
		System.out.print("Enter a number greater than the previous:");
		int h = in.nextInt();
		
		range(l, h);

	}
	/**
	 * Prints out a range between the two given integer inputs
	 * @param low is the smallest integer input
	 * @param high is the larger integer input
	 */
	public static void range(int low, int high)
	{
		for (int i = low; i <= high; i++)
		{
			System.out.println(i);
		}
	}

}
