/**
 * 
 */
package testes.Dominio.Pergunta;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Tarifa;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CategoriaTest {
	
	Categoria c;
	
	@Before
	public void setup() {
	   c = new Categoria();	
	}
	
	@After
	public void tearDown(){
	  c = null;
	}
	
	/**
	 * Test method for {@link Dominio.Pergunta.Categoria#getDescricao()}.
	 */
	@Test
	public void testSetGetDescricao() throws Exception {
		c.setDescricao("Nova descrição");
		assertEquals(c.getDescricao(), "Nova descrição");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Categoria#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		c.setId(2);
		assertEquals(c.getId(), 2);
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Categoria#getNome()}.
	 */
	@Test
	public void testSetGetNome() throws Exception {
		c.setNome("Novo nome");
		assertEquals(c.getNome(), "Novo nome");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Categoria#getTarifa()}.
	 */
	@Test
	public void testSetGetTarifa() throws Exception {
		Tarifa t = new Tarifa();
		t.setDescricao("New tarifa");
		c.setTarifa(t);
		assertEquals(c.getTarifa(), t);
	}


}
