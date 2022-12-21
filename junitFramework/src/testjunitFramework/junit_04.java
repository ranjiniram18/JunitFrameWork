package testjunitFramework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junit_04 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iam printing this before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iam printing this After class");
	}

	@Test
	public void test() {
		System.out.println("Iam printing this during test");
	}

	@Test
	public void test1() {
		System.out.println("Iam printing this during test1");
	}
}
