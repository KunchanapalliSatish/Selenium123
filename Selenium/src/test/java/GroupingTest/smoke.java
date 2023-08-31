package GroupingTest;

import org.testng.annotations.Test;

public class smoke {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("smokke");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}
		@Test
		public void test4() {
			System.out.println("test4");
	}
}
