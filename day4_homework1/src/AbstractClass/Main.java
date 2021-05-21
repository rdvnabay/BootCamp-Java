package AbstractClass;

public class Main {

	public static void main(String[] args) throws Exception {
		GameCalculator gameCalculator1 = new KidsGameCalculator();
		gameCalculator1.calculate();
		gameCalculator1.gameOver();

		GameCalculator[] gameCalculators = { new KidsGameCalculator(), new ManGameCalculator(),
				new WomanGameCalculator(), new OlderGameCalculator() };
		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.calculate();
		}
	}
}
