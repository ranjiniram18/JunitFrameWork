package testjunitFramework;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Junit_05 {

	public String name;
	public int age;

	public Junit_05(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Test
	public void test() {
		System.out.println("name is " + name + " and age is " + age);
	}

	@Parameters
	public static Collection<Object[]> parameter() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Ranjini";
		data[0][1] = 44;
		data[1][0] = "Rani";
		data[1][1] = 45;
		data[2][0] = "Ram";
		data[2][1] = 33;
		return Arrays.asList(data);

	}
}
