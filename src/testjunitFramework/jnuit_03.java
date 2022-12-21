package testjunitFramework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class jnuit_03 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iam printing this before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
