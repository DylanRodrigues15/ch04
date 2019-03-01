

/**
 * @author dylanrodrigues
 * Program calculates the volume of a cube
 * Side lengths of the cube is entered by the user
 */

import java.util.Scanner;

public class Cubes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter in the side length of the cube: ");
		double s = in.nextDouble();
		
		double volume = cubeVolume(s);
		System.out.println("The volume of the cube is " + volume);
	}
	public static double cubeVolume(double sideLength)
	{
		double result = sideLength * sideLength * sideLength;
		return result;
	}

}
