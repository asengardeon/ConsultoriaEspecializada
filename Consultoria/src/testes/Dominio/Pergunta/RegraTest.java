/**
 * 
 */
package testes.Dominio.Pergunta;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Feedback.Feedback;
import Dominio.Pergunta.Regra;
import Dominio.Pergunta.Tarifa;
import Dominio.Pergunta.TipoValor;

/**
 * @author Leandro
 *
 */
public class RegraTest {

	private Regra r;

	
	@Before
	public void setup() {
		r = new Regra();
		
	}
	
	@After
	public void tearDown(){
		r = null;
	}
	
	
	
	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getCondicao1()}.
	 */
	@Test
	public void testSetGetCondicao1() throws Exception {
		r.setCondicao1(TipoValor.horasTrabalhadas);
		assertEquals(r.getCondicao1(), TipoValor.horasTrabalhadas);
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getCondicao2()}.
	 */
	@Test
	public void testSetGetCondicao2() throws Exception {
		r.setCondicao2(17.0);
		assertEquals(r.getCondicao2(), 17.0, 0);
		
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		r.setId(10);
		assertEquals(r.getId(), 10);
	}


	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getOperador()}.
	 */
	@Test
	public void testSetGetOperador() throws Exception {
		r.setOperador('c');
		assertEquals(r.getOperador(), 'c');
	}
	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getOperadorLogico()}.
	 */
	@Test
	public void testSetGetOperadorLogico() throws Exception {
		r.setOperadorLogico('x');
		assertEquals(r.getOperadorLogico(), 'x');
	}
	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getTarifa()}.
	 */
	@Test
	public void testSetGetTarifa() throws Exception {
		Tarifa t = new Tarifa();
		t.setDescricao("description");
		r.setTarifa(t);
		assertEquals(r.getTarifa().getDescricao(), "description");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Regra#getValorPercentual()}.
	 */
	@Test
	public void testSetGetValorPercentual() throws Exception {
		r.setValorPercentual(13.9);
		assertEquals(r.getValorPercentual(), 13.9, 0);
	}

}
