
public class Gorilla extends Mammal {

	public void throwSomething() {
		System.out.println("the gorilla threw some poop");
		this.setEnergyLevel(this.getEnergyLevel() - 5);	
	}
	
	public void eatBanana() {
		System.out.println("The gorilla ate a banana, is less hangry");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Oh no, he's escaping the enclosure");
		this.setEnergyLevel(getEnergyLevel() - 10);
	}
}
