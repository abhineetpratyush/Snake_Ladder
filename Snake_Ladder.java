public class Snake_Ladder{
	public static final int MIN = 1;
	public static final int MAX = 6;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args){
		int pos = 0;
		System.out.println("Welcome to the game of Snakes and Ladders");
		int die_roll = DieRoll();
		System.out.println("Die Roll: " + die_roll);
		int option = OptionGenerator();
		System.out.println("New pos: " + ChangePos(pos, die_roll, option));
	}
	//method to  return a random value of dice roll
	public static int DieRoll(){
		int die_roll = MIN + (int)(Math.random() * ((MAX-MIN) + 1));
		return die_roll;
	}
	//method to generate a movement option 
	public static int OptionGenerator(){
		int option = (int)(Math.random() * 3);
		return option;
	}
	//method to change position based on initial pos and option
	public static int ChangePos(int pos, int die_roll, int option){
		System.out.println("Initial pos: " + pos);
		switch(option){
			case LADDER: 
				pos += die_roll;
				System.out.println("Option: Ladder");
				break;
			//the new pos in case of snake can go below 0, that restriction has been applied in the following use cases
			case SNAKE:
				pos -= die_roll;
				System.out.println("Option: Snake");
				break;
			default:
				System.out.println("Option: No Play");
		}
		return pos;
	}

}



