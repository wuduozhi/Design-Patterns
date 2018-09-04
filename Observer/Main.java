public class Main{
	public static void main(String [] args){
		NumberGenerator generator = new RandomNumberGenerator();
		Observer obserbor_1 = new DigitObserver();
		Observer obserbor_2 = new GraphObserver();
		generator.addObserver(obserbor_1);
		generator.addObserver(obserbor_2);
		generator.execute();
	}
}