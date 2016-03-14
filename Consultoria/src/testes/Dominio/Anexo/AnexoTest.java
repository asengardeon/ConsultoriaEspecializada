/**
 * 
 */
package testes.Dominio.Anexo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
public class AnexoTest {

	private Anexo a;
	
	
	@Before
	public void setup() {
		a = new Anexo();		
	}
	
	@After
	public void tearDown(){
		a = null;
	}
	
	

	/**
	 * Test method for {@link Dominio.Anexo.Anexo#getAnexo()}.
	 */
	@Test
	public void testSetGetAnexo() throws Exception {
		String s = "Um Anexo";
		a.setAnexo(s);
		assertEquals(a.getAnexo(), s);
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
