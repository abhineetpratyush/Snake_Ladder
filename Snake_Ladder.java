public class Snake_Ladder{
	public static final int MIN = 1;
	public static final int MAX = 6;
	public static void main(String[] args){
		int pos = 0;
		System.out.println("Welcome to the game of Snakes and Ladders");
		System.out.println("Die Roll: " + DieRoll());
	}
	//method to  return a random value of dice roll
	public static int DieRoll(){
		int die_roll = MIN + (int)(Math.random() * ((MAX-MIN) + 1));
		return die_roll;
	}
}



