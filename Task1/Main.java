//1.a Create a class Main with a main method.
class Main {

	public static void main(String[] args) {
		//1.g In the main method in the Main class, 
		//create an instance of the Team class (i.e. instantiate the Team class).
		Team t1 = new Team("Team 1");

		Team t2 = new Team("Team 2");
		Team t3 = new Team("Team 3");
		Team t4 = new Team("Team 4");
		Team t5 = new Team("Team 5");
		Team t6 = new Team("Team 6");

		//1.i From the main method, call the method setRank() on the instance of 
		//Team you created in step 1.g with a number of your choice.
		t1.setRank(5);

		t2.setRank(1);
		t3.setRank(8);
		t4.setRank(7);
		t5.setRank(3);
		t6.setRank(4);

		t1.addPlayer(new String[] {"Morten", "Peter", "Spartacus", "Osman", "Jeppe"});
		t2.addPlayer(new String[] {"Naruto", "Sausage", "Scarra", "Otto", "DisguisedToast"});
		t3.addPlayer(new String[] {"Carrot", "Vegetable", "Pickle", "Rice", "Caillou"});
		t4.addPlayer(new String[] {"Et", "To", "Træ", "Fire", "Phem"});
		t5.addPlayer(new String[] {"B", "I", "L", "B", "O"});
		t6.addPlayer(new String[] {"Eren", "Mikasa", "Annie", "Reindeer", "Bear toe"});
		//1.k From the main method, create 5 more Team instances and print them using their toString() method.


		System.out.println(t1.toString());

		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());
		


	}

}