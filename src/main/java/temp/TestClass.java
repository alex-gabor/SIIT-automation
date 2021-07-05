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

		System.out.println("Before entire class");
	}

	@Before
	public void before() {

		System.out.println("Before each test");
	}

	@Test
	public void myTestMethod() {

		System.out.println("Test 1");

	}

	@Test
	public void test02() {

		System.out.println("Test 2");
	}

	@Test
	public void test03() {

		System.out.println("Test 3");
	}
}
