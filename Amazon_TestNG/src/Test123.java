import org.testng.annotations.Test;

public class Test123 {
	@Test
	public void m1() {

		String value = String.valueOf((int) Double.parseDouble("3.0"));
		System.out.println(value);
		System.out.println(System.getProperty("user.dir"));
	}
}
