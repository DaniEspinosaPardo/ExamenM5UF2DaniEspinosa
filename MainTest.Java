package joc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String paraules[] = { "goma" };
		String p = "____";
		assertEquals(false, Main.existeixLletra('2', paraules, p, 1));
		assertEquals(true, Main.existeixLletra('a', paraules, p, 1));
		assertEquals(false, Main.existeixLletra('.', paraules, p, 1));
		assertEquals(true, Main.existeixLletra('m', paraules, p, 1));
	}

}
