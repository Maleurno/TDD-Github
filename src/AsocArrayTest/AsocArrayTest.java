package AsocArrayTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import AsocArray.AsocArray;
import AsocArray.UndefinedKeyException;

public class AsocArrayTest {
	private AsocArray array;
	
	@Before
	public void before(){
		array =new AsocArray();
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
		String prueba = array.get("provincia");
		assertEquals("malaga",prueba);
	}
	
	@Test
	public void pruebaGetOrElse(){
		String prueba = array.getOrElse("nombre", "null");
		assertEquals("luis",prueba);
		prueba = array.getOrElse("no", "null");
		assertEquals("null",prueba);
	}
	
	@Test
	public void pruebaContainKey(){
		boolean prueba = array.containKeys("nombre");
		assertEquals(prueba,true);
		prueba = array.containKeys("no");
		assertEquals(prueba,false);
	}
	
	@Test
	public void pruebaRemove(){
		boolean prueba = array.remove("nombre");
		assertEquals(prueba,true);
		prueba = array.remove("no");
		assertEquals(prueba,false);
	}
	
	@Test
	public void pruebaSize(){
		int prueba = array.size();
		assertEquals(prueba,4);
	}
	
	@Test
	public void pruebaGet(){
		String prueba = array.get("nombre");
		assertEquals("luis",prueba);
	}
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void pruebaGetException(){
		e.expect(UndefinedKeyException.class);
		e.expectMessage("No se admite número negativo");
		array.get("Madrid");
	}

}
