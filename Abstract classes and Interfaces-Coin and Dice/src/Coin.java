
public class Coin extends ThrownObject {

	@Override
	public void head() {
		
		double randomNumber = Math.random();
		System.out.println("The coin came out heads and it's " +randomNumber+" ...so I won!");
			
	}

	@Override
	public void tail() {
		double randomNumber = Math.random();
		System.out.println("The coin came out tails and it's " +randomNumber+" ...so I lose!");	
	}

}
