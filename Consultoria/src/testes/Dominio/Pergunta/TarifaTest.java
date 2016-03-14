/**
 * 
 */
package testes.Dominio.Pergunta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import Dominio.Pergunta.Tarifa;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TarifaTest {
	
	private Tarifa t;


	/**
	 * Test method for {@link Dominio.Pergunta.Tarifa#getDescricao()}.
	 */
	@Test
	public void testSetGetDescricao() throws Exception {
		t.setDescricao("desc");
		assertEquals(t.getDescricao(), "desc");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Tarifa#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	
	
}
