//------------------------------------------------------------------------------
//This method simulates an ant trying to crawl up 6 steps of a building
//Susan Driskill
//February 24, 2020
//Midterm
//Problem 1
//------------------------------------------------------------------------------

//Import Random
import java.util.Random;


public class MidtermProblem1 {

	public static void main(String[] args) {
		antCrawl();
	}
	
	public static void antCrawl() {
		//The ant starts on the ground at height 0
		int height = 0;
		int falls = 0;
		Random rand = new Random ();
		int upOrDown;
		do {
			//upOrDown = 0 to fall, or 1 to climb
			upOrDown = rand.nextInt(2);
			if (upOrDown == 0) {
				//The ant always falls back down to 0
				height = 0;
				falls++;
			}else {
				//The ant continues climbing higher
				height += 1; 
			}
		}while (height < 6);
		//To confirm that the ant reached the 6th step
		System.out.println("The ant reached the " + height + "th step");
		System.out.println("number of falls: " + falls);
	}

}
