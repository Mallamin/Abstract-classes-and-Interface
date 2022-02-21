
public class Dice extends ThrownObject{

	@Override
	public void head() {
		
		
		double randomNumber = Math.random();
		System.out.println("The dice came out head and it's " +randomNumber+" ...it's  still my turn");
		
	}

	@Override
	public void tail() {
		double randomNumber = Math.random();
		System.out.println("The dice came out tail and it's " +randomNumber+ "....It's your turn...I'm disappointed");
		
	}

}
