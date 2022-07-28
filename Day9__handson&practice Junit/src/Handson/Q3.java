package Handson;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Q3 {

	@Test
	void test() {
		Demo2 d= new Demo2();
		assertTrue(d.palindromeCheck("mom"));
	}
	@Test
	void test1() {
		Demo2 d= new Demo2();
		assertFalse(d.palindromeCheck("mome"));
	}
	@Test
	void test2() {
		Demo2 d= new Demo2();
		assertTrue(d.palindromeCheck("mom"));
	}
}
