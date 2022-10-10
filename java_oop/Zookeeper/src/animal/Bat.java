package animal;

public class Bat extends Mammal{
	private int flyLoss = -50;
	private int eatHumansGain = 25;
	private int attackTownLoss = -100;
	
	public void fly(int times) {
		int energy = flyLoss * times;
		this.energyLevel += energy;
		System.out.println("Flap flap flap: Used up " + energy + " energy.");
	}
	public void eatHumans(int times) {
		int energy = eatHumansGain * times;
		this.energyLevel += energy;
		System.out.println("So-=ell, nevermind. Gained " + energy + " energy.");
	}
	public void attackTown(int times) {
		int energy = flyLoss * times;
		this.energyLevel += energy;
		System.out.println("The sound ofa town on fire. Used up " + energy + " energy.");
	}
	

}
