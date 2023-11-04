package telran.multithreding;

public class Printer extends Thread {
	private char  symbol;
	private int nRuns;
	public Printer(char symbol, int nRuns) {
		this.symbol = symbol;
		this.nRuns = nRuns;
	}
	
}
