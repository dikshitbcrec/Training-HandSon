package Handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Q1 {

	@Test
	void test() {
		Demo d=new Demo();
		String a=d.Conca("Hello","World");
		System.out.println(a);
		assertEquals("HelloWorld",a);
	}

}
