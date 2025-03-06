import java.util.ArrayList; 

//1.b Create an entity class called Team.
class Team {

	//1.c Add a private instance variable/attribute to Team to hold the team's name.
	private String name;
	//1.d Add another private instance variable to hold the team's rank (some number).
	private int rank;
	//1.e Add yet another private instance variable to hold the names of players in the team.
	private ArrayList<String> members = new ArrayList<String>();

	//1.f Add a constructor with a parameter, so that the Team can be instantiated with 
	//a team name. Make sure the parameter value is assigned to the mathcing instance variable in the constructor.
	public Team(String name) {
		this.name = name;
	}

	//1.h In the Team class add a method called setRank() that takes a number as parameter and assigns it to the rank attribute.
	public void setRank(int num) {
		this.rank = num;
	}
	//1.j In the Team class add a toString() method that returns a String formated like this: "Hold: De Uovervindelige Rang: 3"

	//1.m Adjust the toString() method so that each playername is a part of the returned String - preferably with each name on it's own line.
	public String toString() {
		return String.format("Team: " + name + " Rank: " + rank + "Members of team: " + members);
	}

	//1.l Previously you created an ArrayList of team playernames as an attribute in the Team class. 
	//Now add a new method to the class, which adds a name to this list. Call the method addPlayer() and give it a suitable parameter.
	public void addPlayer(String[] players) {
		for (String player : players) {
			members.add(player);
		}
	}

}

