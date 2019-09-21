import java.util.Scanner;

public class Poll {
	public static void main(String[] args) {
		/*
	 	* Purpose of program is to gather ratings from 1 to 10 on 5 topics
	 	* Must be able to accept ratings from multiple people before displaying results
	 	* 
	 	*/
		//Initializing stuff
		Scanner scnr = new Scanner(System.in);
		String[] t = new String[5];
		double [] a = new double[5];
		int [] rT = new int[5];
		int [][] re = new int[5][10];
		double temp; //Holds values temporarily
		int hTV = 0;
		int hTT = 0;
		int lTV = 10000;
		int lTT = 0;
		int ra;
		int mc = 0; //Main loop count
		int c = 1; //continue input
		int i; //used for most loops
		int o; //used for nested loops
		
		t[0] = "Work";
		t[1] = "School";
		t[2] = "Sleep";
		t[3] = "Food";
		t[4] = "Memes";
	
		System.out.println("Please rate the following categories from 1 to 10");
		//Loops till all users are done
		while(c == 1) {
			i = 0;
			//Loop that gathers ratings
			for(i=0; i < 5; i++) {
				System.out.print(t[i] + ":");
				ra = scnr.nextInt();
				re[i][ra - 1] ++;
			}
			//Prompts to see if there are more users to enter ratings
			System.out.print("Enter any whole number other than 1 if there is no one else to rate topics:");
			c = scnr.nextInt();
			mc ++;
		}
		//Calculations
		i = 0;
		temp = 0;
		for(i=0; i < 5; i++) {
			for(o = 1; o < 11; o++) {
				temp = temp + (o * re[i][o-1]);
			}
			rT[i] = (int)temp; 
			a[i] = temp / mc;
			if(hTV < rT[i]) {
				hTV = rT[i];
				hTT = i;
			}
			if(lTV > rT[i]) {
				lTV = rT[i];
				lTT = i;
			}
		}
		//Prints out header of table
		System.out.println("Topic:\t1 2 3 4 5 6 7 8 9 10   Average");
		i=0;
		//prints out table of scores
		while(i < 5) {
			//System.out.println(t[i]+ "\t" + re[i][0] + " " + re[i][1] + " " + re[i][2] + " " + re[i][3] + " " 
					//+ re[i][4] + " " + re[i][5] + " " + re[i][6] + " " + re[i][7] + " " + re[i][8] + " " 
					//+ re[i][9] + "    " + a[i]);
			System.out.printf("%s\t%d %d %d %d %d %d %d %d %d %d    %.1f\n", t[i], re[i][0], re[i][1], re[i][2], re[i][3],
								re[i][4], re[i][5], re[i][6], re[i][7], re[i][8], re[i][9], + a[i]);
			i++;		
		}
		System.out.println("The topic " + t[hTT] + " received the highest total rating at " + hTV + " points.");
		System.out.println("The topic " + t[lTT] + " received the lowest total rating at " + lTV + " points.");
		scnr.close();
	}
}
