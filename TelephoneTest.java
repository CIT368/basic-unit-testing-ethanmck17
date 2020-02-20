import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelephoneTest {

	@Test
	/**
	 * Tests format() response to correct input: 5709164252.
	 */
	void formatCorrectInput() {
		assertEquals("(570)916-4252", Telephone.format("5709164252"));
	}
	
	@Test
	/**
	 * Tests format() response to unnecessary input: (570)916-4252
	 */
	void formatNeedlessInput() {
		assertEquals("(570)916-4252", Telephone.format("(570)916-4252"));
	}
	
	@Test
	/**
	 * Tests format response to bad input: Hello world.
	 */
	void formatBadInput() {
		assertEquals("Hello world.", Telephone.format("Hello world."));
	}
	
	@Test
	/**
	 * Tests format() response to input of correct length but incorrect type: abcdefghij
	 */
	void formatInterestingInput() {
		assertEquals("(abc)def-ghij", Telephone.format("abcdefghij"));
	}
}
