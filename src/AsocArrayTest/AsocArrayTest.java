package AsocArrayTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import AsocArray.AsocArray;

public class AsocArrayTest {
	private AsocArray array;
	
	@Before
	public void before(){
		array.put("nombre", "luis");
		array.put("apellido", "martin");
		array.put("dni", "12345567P");
		array.put("pais", "españa");
	}
	
	@After
	public void after(){
		array = null;
	}

	@Test
	public void pruebaPut() {
		array.put("provincia", "malaga");
		assertEquals("malaga",array.get("provincia"));
	}
	
	@Test
	public void pruebaGetOrElse(){
		
	}
	
	@Test
	public void pruebaContainKey(){
		
	}
	
	@Test
	public void pruebaRemove(){
		
	}
	
	@Test
	public void pruebaSize(){
		
	}
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void pruebaGet(){
		
	}

}
