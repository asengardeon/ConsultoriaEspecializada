/**
 * 
 */
package testes.Dominio.Pergunta;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import Dominio.Pergunta.Pergunta;
import Dominio.Pergunta.Tarifa;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TarifaTest {
	
	private Tarifa t;


	
	@Before
	public void setup() {
		t = new Tarifa();		
	}
	
	@After
	public void tearDown(){
		t = null;
	}
	
	
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
		t.setId(10);
		assertEquals(t.getId(), 10);
	}

	
	
}
