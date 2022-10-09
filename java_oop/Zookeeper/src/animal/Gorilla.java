package animal;

public class Gorilla extends Mammal {
	private int throwLoss = -5;
	private int bananaGain = 10;
	private int climbLoss = -10;
	
	
	public void throwSomething(int times) {
		int energyTotal = throwLoss * times;
		this.energyLevel += energyTotal;
		System.out.println("Gorilla just threw " + times + " things at an energy loss of: " + energyTotal);
	}
	
	public void eatBananas(int times) {
		int energyTotal = bananaGain * times;
		this.energyLevel += energyTotal;
		System.out.println("Gorilla just ate " + times + " bananas with an energy gain of: " + energyTotal);
	}
	
	public void climb(int times) {
		int energyTotal = climbLoss * times;
		this.energyLevel += energyTotal;
		System.out.println("Gorilla just climbed a tree " + times + " times for an energy loss of: " + energyTotal);
	}
}
