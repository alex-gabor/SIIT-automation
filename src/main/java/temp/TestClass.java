package temp;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author alexgabor
 *
 */
public class TestClass {

	@BeforeClass
	public static void beforeClass() {

		System.out.println("Before class");
	}

	@Before
	public void before() {

		System.out.println("Before each test");
	}

	@Test
	public void myTestMethod() {

		System.out.println("running...");

	}

	@Test
	public void test01() {

		System.out.println("Test 1");
	}
}
