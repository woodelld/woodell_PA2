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
		String[] topic = new String[5];
		double [] averages = new double[5];
		int [] ratingTotal = new int[5];
		int [][] responses = new int[5][10];
		double temp; //Holds values temporarily
		int highestTotalValue = 0;
		int highestTotalTopic = 0;
		int lowestTotalValue = 10000;
		int lowestTotalTopic = 0;
		int ratings;
		int mc = 0; //Main loop count
		int c = 1; //continue input
		int i; //used for most loops
		int o; //used for nested loops
		
		topic[0] = "Work";
		topic[1] = "School";
		topic[2] = "Sleep";
		topic[3] = "Food";
		topic[4] = "Memes";
	
		System.out.println("Please rate the following categories from 1 to 10");
		//Loops till all users are done
		while(c == 1) {
			i = 0;
			//Loop that gathers ratings
			for(i=0; i < 5; i++) {
				System.out.print(topic[i] + ":");
				ratings = scnr.nextInt();
				responses[i][ratings - 1] ++;
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
				temp = temp + (o * responses[i][o-1]);
			}
			ratingTotal[i] = (int)temp; 
			averages[i] = temp / mc;
			if(highestTotalValue < ratingTotal[i]) {
				highestTotalValue = ratingTotal[i];
				highestTotalTopic = i;
			}
			if(lowestTotalValue > ratingTotal[i]) {
				lowestTotalValue = ratingTotal[i];
				lowestTotalTopic = i;
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
			System.out.printf("%s\t%d %d %d %d %d %d %d %d %d %d    %.1f\n", topic[i], responses[i][0], responses[i][1], responses[i][2], responses[i][3],
								responses[i][4], responses[i][5], responses[i][6], responses[i][7], responses[i][8], responses[i][9], + averages[i]);
			i++;		
		}
		System.out.println("The topic " + topic[highestTotalTopic] + " received the highest total rating at " + highestTotalValue + " points.");
		System.out.println("The topic " + topic[lowestTotalTopic] + " received the lowest total rating at " + lowestTotalValue + " points.");
		scnr.close();
	}
}
