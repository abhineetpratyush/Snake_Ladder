public class Snake_Ladder{
	public static final int MIN = 1;
	public static final int MAX = 6;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args){
		int pos_p1 = 0, pos_p2 = 0, count_p1 = 0, count_p2 = 0, rolling_chance = 0, option = 0;
		System.out.println("Welcome to the game of Snakes and Ladders");
		while(pos_p1 != 100 && pos_p2 != 100){
			rolling_chance++; //alternately give chances to P1 and P2
			if(rolling_chance % 2 != 0){
				//Player1
				do{
					int die_roll = DieRoll();
					System.out.println("----Player 1----");
					System.out.println("Die Roll: " + die_roll);
					count_p1++;
					option = OptionGenerator();
					pos_p1 = ChangePos(pos_p1, die_roll, option);
					System.out.println("New pos: " + pos_p1);
				} while(option == LADDER && pos_p1 != 100);
			}
			else{
				//Player2
                                do{
                                        int die_roll = DieRoll();
                                        System.out.println("----Player 2----");
                                        System.out.println("Die Roll: " + die_roll);
                                        count_p2++;
                                        option = OptionGenerator();
                                        pos_p2 = ChangePos(pos_p2, die_roll, option);
                                        System.out.println("New pos: " + pos_p2);
                                } while(option == LADDER && pos_p2 != 100);
			}
		}
		if(pos_p1 == 100)
			System.out.println("Winner: Player 1 | No. of dice rolls needed to win (Player 1): " + count_p1);
		else
			System.out.println("Winner: Player 2 | No. of dice rolls needed to win (Player 2): " + count_p2++);
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
			case SNAKE:
				pos -= die_roll;
				System.out.println("Option: Snake");
				break;
			default:
				System.out.println("Option: No Play");
		}
		if(pos < 0)
			pos = 0;
		if(pos > 100)
			pos -= die_roll;
		return pos;
	}

}



