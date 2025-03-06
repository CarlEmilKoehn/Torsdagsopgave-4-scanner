import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	
	
	private ArrayList<String> actions;
	

	GameMenu(ArrayList<String> actions){
		this.actions = new ArrayList<>(actions);
	}

	public void displayMenu() {
		for (String action : actions) {
			System.out.println(action);
		}
	}

	public String getAction() {
		
		System.out.println("Type a number to choose an action");
		displayMenu();

		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();
		return choice;

	}
}