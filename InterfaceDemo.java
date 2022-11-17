interface Player {
	//declare only contant variables
	//declare only abstract methods, not concrete methods
	//All data members are 'public' by default
	final String TEAM_NAME = "India";
	final String COACH = "Garry Cirsten";

	abstract String getPlayerName ();
	abstract double getPlayerHeight ();
}

class ViratKohli implements Player {
	String name = "Virat Kohli";

	@Override
	public String getPlayerName () { //while overriding interface methods, it must be public in child class
		return this.name;
	}

	@Override
	public double getPlayerHeight () {
		return 22.44;
	}
}

public class InterfaceDemo {
	public static void main (String[] args) {
		System.out.println("InterfaceDemo");
		ViratKohli virat = new ViratKohli();
		System.out.println(virat.getPlayerName());
	}
}