package Handson;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Q2 {

	@Test
	void test() {
		ArrayList<String>h1=new ArrayList<>();
		h1.add("Dikshit");
		h1.add("Yusuf");
		h1.add("Hello");
		Employee e=new Employee();
		assertEquals("FOUND",e.findName(h1, "Dikshit"));
		
	}

}
