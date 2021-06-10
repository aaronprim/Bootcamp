
public class GorillaTest {
	
	public static void main(String[] args) {
		
		Gorilla harambe = new Gorilla();
		
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.climb();
		harambe.eatBanana();
		harambe.eatBanana();
		
		System.out.print("Gorilla's energy level is: " );
		harambe.displayEnergy();
		
	}
}
