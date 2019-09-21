import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		/*
		 * Purpose of program is to encrypt 4 digit integer.
		 * Scan 4 digit integer
		 * Replace each digit with the remainder of 7 plus the digit then 
		 * divided by ten. 
		 * Swap first digit with third and swap the second with the fourth.
		 * Print encrypted integer
		 */
		Scanner scnr = new Scanner(System.in);
		int numToEncrypt;
		int digitOne;
		int digitTwo;
		int digitThree;
		int digitFour;
		int temp;
		//Scan number
		System.out.print("Please enter a four digit integer here:");
		numToEncrypt = scnr.nextInt();
		//Split into individual digits
		digitOne = numToEncrypt / 1000;
		digitTwo = (numToEncrypt % 1000) / 100;   
		digitThree = ((numToEncrypt % 1000) % 100) / 10;
		digitFour = ((numToEncrypt % 1000) % 100) % 10;
		//Assign digits with encrypted numbers
		digitOne = (digitOne + 7) % 10;
		digitTwo = (digitTwo + 7) % 10;
		digitThree = (digitThree + 7) % 10;
		digitFour = (digitFour + 7) % 10;
		//Swap 1 with 3
		temp = digitOne;
		digitOne = digitThree;
		digitThree = temp;
		//Swap 2 with 4
		temp = digitTwo;
		digitTwo = digitFour;
		digitFour = temp;
		//Print encrypted number
	 	System.out.printf("Your encrypted number is %d%d%d%d.\n", digitOne, digitTwo, digitThree, digitFour);
	 	scnr.close();
	}
}
