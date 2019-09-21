import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) {
		/*
		 * Purpose of program is to reverse steps of encryption program
		 * Scan integer
		 * Swap first with third and second with fourth
		 * Add 3 to digit and then use % 10 to find decrypted number
		 * Print 4 digits
		 * 0123456789
		 * 7890123456
		 */
		Scanner scnr = new Scanner(System.in);
		int numToDecrypt;
		int digitOne;
		int digitTwo ;
		int digitThree;
		int digitFour;
		int temp;
		
		System.out.print("Enter number to decrypt here:");
		numToDecrypt = scnr.nextInt();
		
		digitOne = numToDecrypt / 1000;
		digitTwo = (numToDecrypt % 1000) / 100;   
		digitThree = ((numToDecrypt % 1000) % 100) / 10;
		digitFour = ((numToDecrypt % 1000) % 100) % 10;
		
		//Swap 1 with 3
		temp = digitOne;
		digitOne = digitThree;
		digitThree = temp;
		//Swap 2 with 4
		temp = digitTwo;
		digitTwo = digitFour;
		digitFour = temp;
		
		digitOne = (digitOne + 3) % 10;
		digitTwo = (digitTwo + 3) % 10;
		digitThree = (digitThree + 3) % 10;
		digitFour = (digitFour + 3) % 10;
		
		System.out.printf("Your decrypted number is %d%d%d%d.", digitOne, digitTwo, digitThree, digitFour);
		scnr.close();
	}
}
