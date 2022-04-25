package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERSIZE = 12;
	private static final int ERROR = -1;
	private static final int FULL = 11;
	private final int[] numbers = new int[NUMBERSIZE];


	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == ERROR;
		}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}
}
