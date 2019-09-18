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
		int nE;
		int encryptedNum;
		int d1;
		int d2;
		int d3;
		int d4;
		int temp;
		//Scan number
		System.out.print("Please enter a four digit integer here:");
		nE = scnr.nextInt();
		//Split into individual digits
		d1 = nE / 1000;
		d2 = (nE % 1000) / 100;   
		d3 = ((nE % 1000) % 100) / 10;
		d4 = ((nE % 1000) % 100) % 10;
		System.out.printf("%d %d %d %d\n", d1, d2, d3, d4);
		//Assign digits with encrypted numbers
		d1 = (d1 + 7) % 10;
		d2 = (d2 + 7) % 10;
		d3 = (d3 + 7) % 10;
		d4 = (d4 + 7) % 10;
		System.out.printf("%d %d %d %d\n", d1, d2, d3, d4);
		//Swap 1 with 3
		temp = d1;
		d1 = d3;
		d3 = temp;
		//Swap 2 with 4
		temp = d2;
		d2 = d4;
		d4 = temp;
		//Assign value to encrypted number object
		encryptedNum = (d1 * 1000) + (d2 * 100) + (d3 * 10) + d4; 
		//Print encrypted number
	 	System.out.println("Your encrypted number is " + encryptedNum);
	 	System.out.printf("Your encrypted number is %d.\n", encryptedNum);
	
		
	}
}
