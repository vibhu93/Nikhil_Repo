package Test;

public class constructor {


	public constructor() {
		System.out.println("I am inside constructors");
	}

	int rollnumber;
	String Name;
	double percentage;
	public constructor(int rollnumber, String Name, double percentage) {
		this.rollnumber = rollnumber;
		this.Name =  Name;
		this.percentage = percentage;

	}

	public void displayed() {
		System.out.println("Roll Number Is: " + rollnumber+ " " +"Name Is: "+ Name +" Percentage is: "+ percentage);
	}

	public static void main(String[] args) {

		constructor c = new constructor();

		constructor C1 = new constructor(10, "Vaibhav", 67.68D);
		C1.displayed();



	}

}
