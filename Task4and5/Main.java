import java.util.ArrayList;

class Main{

	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>();

		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		GameMenu g1 = new GameMenu(actions);	

		//g1.displayMenu();

		String choice = g1.getAction();

		int userChoice = Integer.parseInt(choice);

		doAction(userChoice);
	}
	public static void doAction(int action) {
			
			switch(action) {
			case 1:
				System.out.println("Starting game now...");
				break;
			case 2: 
				System.out.println("Fetching previously saved game data");
			case 3:
				System.out.println("Game Paused");
				break;
			case 4: 
				System.out.println("Ending game");
				break;

			}
		}
}