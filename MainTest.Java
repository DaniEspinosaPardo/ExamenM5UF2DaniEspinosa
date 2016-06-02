package joc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String paraules[] = { "goma" };
		Main.paraules = paraules;
		Main.p = "____";
		assertEquals(false, Main.nova_lletra('2'));
		assertEquals(true, Main.nova_lletra('a'));
		assertEquals(false, Main.nova_lletra('.'));
		assertEquals(true, Main.nova_lletra('m'));
	}

}
