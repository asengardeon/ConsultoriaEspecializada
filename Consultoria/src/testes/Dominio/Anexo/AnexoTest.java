/**
 * 
 */
package testes.Dominio.Anexo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Dominio.Anexo.Anexo;

/**
 * @author Leandro
 *
 */
public class AnexoTest {

	private Anexo a;

	/**
	 * Test method for {@link Dominio.Anexo.Anexo#getAnexo()}.
	 */
	@Test
	public void testSetGetAnexo() throws Exception {
		a.setAnexo("Um Anexo");
		assertEquals(a.getAnexo(), "Um Anexo");
	}

		/**
	 * Test method for {@link Dominio.Anexo.Anexo#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		a.setId(99999);
		assertEquals(a.getId(), 99999);
	}

	
}
