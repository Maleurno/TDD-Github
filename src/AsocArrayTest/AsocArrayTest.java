package AsocArrayTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AsocArray.AsocArray;

public class AsocArrayTest {
	private AsocArray array;
	
	@Before
	public void before(){
		array.put("nombre", "luis");
		array.put("apellido", "martin");
		array.put("dni", "12345567P");
		array.put("pais", "espa�a");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
