package project_black_jack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Cards {
	DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(
			10), ACE(11);

	private int value;

	private Cards(int value) {
		this.value = value;
	}

//	private static final List<Cards> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
//	private static final int SIZE = VALUES.size();
//	private static final Random RANDOM = new Random();
//
//	public static Cards randomLetter() {
//		return VALUES.get(RANDOM.nextInt(SIZE));
//	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
