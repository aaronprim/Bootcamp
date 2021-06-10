
public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("The bat is flying");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	
	public void eatHumans() {
		System.out.println("Oh heck he bit me");
		this.setEnergyLevel( + 25);
	}
	
	public void attackTown() {
		System.out.println("The bats are attacking the town");
		this.setEnergyLevel( - 50);
	}
}
